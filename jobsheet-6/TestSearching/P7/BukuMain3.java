import java.util.Scanner;
public class BukuMain3{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianBuku3 data = new PencarianBuku3();
        int jumBuku = 5;

        System.out.println("--------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil: ");
        
        for (int i = 0; i <jumBuku ; i++) {
            System.out.println("-----------------");
            s.nextLine();
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s.nextLine();
            s.nextLine();
            System.out.print("Judul buku \t : ");
            String judulBuku = s.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            s.nextLine();
            System.out.print("Pengarang \t : ");
            String pengarang = s.nextLine();
            System.out.print("Stock \t : ");
            int stock = s.nextInt();

            Buku3 m = new Buku3(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println();
        System.out.println("====================================");
        System.out.println("Pencarian Data : ");
        System.out.println("1. Berdasarkan Kode Buku       ");
        System.out.println("2. Berdasarkan Judul Buku      ");
        System.out.println("=====================================");
        System.out.print("Pilih opsi pencarian (1/2): ");
        int opsi = s.nextInt();
        System.out.println();

        switch (opsi) {
            case 1 :
                System.out.println("Data Keseluruhan Buku : ");
                data.tampil();
                System.out.println();

                System.out.println("Masukkan Kode Buku yang dicari: ");
                s.nextLine();
                System.out.print("Kode Buku : ");
                String cari = s.nextLine();
                System.out.println("Menggunakan Sequential Search");
                int posisi = data.FindSeqSearch(cari);
                data.tampilPosisi(cari, posisi);

                System.out.println();
                data.TampilData(cari, posisi);

                System.out.println();
                System.out.println("============================");
                System.out.println("Menggunakan Binary Search");
                posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
                data.tampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
                break;

            case 2:
                data.bubbleSort();
                System.out.println("Data Keseluruhan Buku : ");
                data.tampil();
                System.out.println();

                System.out.println("Masukkan Judul Buku yang dicari: ");
                s.nextLine();
                System.out.print("Judul Buku : ");
                String cariJ = s.nextLine();
                System.out.println("Menggunakan Sequential Search");
                int posisiJ = data.FindSeqSearchJ(cariJ);
                int hasil = (posisiJ != -1 ? 1 : 0);
                data.tampilPosisiJ(cariJ, posisiJ, hasil);

                System.out.println();
                data.TampilDataJ(cariJ, posisiJ);

                System.out.println();
                System.out.println("============================");
                System.out.println("Menggunakan Binary Search");
                posisi = data.FindBinarySearchJ(cariJ, 0, jumBuku -1);
                data.tampilPosisiJ(cariJ, posisiJ, hasil);
                data.TampilDataJ(cariJ, posisiJ);
                break;
        }
    }
}