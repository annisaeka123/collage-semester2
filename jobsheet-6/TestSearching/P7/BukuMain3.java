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
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
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
        System.out.println("----------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        data.tampil();
        System.out.println("----------------------------------------------------");

        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();

        System.out.println("==================");
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        System.out.println("==================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}