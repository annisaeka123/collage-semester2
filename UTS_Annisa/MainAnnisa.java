import java.util.Scanner;

public class MainAnnisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PencarianAnnisa data= new PencarianAnnisa();
        int jumNas = 6;

        System.out.println("--------------------------------------");
        System.out.println("Masukkan data Nasabah: ");

        for (int i = 0; i < jumNas; i++) {
            System.out.println("----------------------------------");
            sc.nextLine();
            System.out.print("No Rekening       : ");
            String norekAnnisa = sc.nextLine();
            sc.nextLine();
            System.out.print("Nama              : ");
            String namaAnnisa = sc.nextLine();
            sc.nextLine();
            System.out.print("NIK               : ");
            String nikAnnisa = sc.nextLine();
            System.out.print("Umur              : ");
            int umurAnnisa = sc.nextInt();
            System.out.print("Saldo             : ");
            double saldoAnnisa = sc.nextDouble();

            NasabahAnnisa m = new NasabahAnnisa(norekAnnisa, namaAnnisa, nikAnnisa, umurAnnisa, saldoAnnisa);
            data.tambah(m);
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("Menu    :");
        System.out.println("1. Pencarian data nasabah");
        System.out.println("2. Urut data berdasarkan saldo");
        System.out.println("3. Keluar");
        System.out.println("===================================");
        System.out.println("Pilih opsi (1/2/3): ");
        int opsi = sc.nextInt();
        System.out.println();

        switch (opsi) {
            case 1 :
                System.out.println("Masukkan NIK dari data yang dicari : ");
                sc.nextLine();
                System.out.print("NIK: ");
                String cari = sc.nextLine();
                int posisi = data.cariData(cari);
                data.TampilData(cari, posisi);
                
            case 2 :
                data.bubbleSort();

            case 3:
                break;
            default:
                break;
        }
    }
}