import java.util.Scanner;

public class AntrianPembeliMain_3 {
    public static void main(String[] args) {
        AntrianPembeli_3 antrianPembeli3 = new AntrianPembeli_3();
        Scanner annisa = new Scanner(System.in);
        int pilihan = 0;

        System.out.println("========== QUIZ PRAKTIKUM ASD TI ==========");
        System.out.println("Dibuat oleh     : Annisa Eka Puspita");
        System.out.println("NIM             : 2341720131");
        System.out.println("Absen           : 3");
        System.out.println("============================================");
        System.out.println("Sistem Antrian Resto");
        System.out.println();

        do {
            System.out.println("===Menu===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by Annisa");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Keluar");
            System.out.print("\nPilih(1-6) : ");

            pilihan = annisa.nextInt();

            switch (pilihan) {
                case 1:
                    //antrianPembeli3.tambahAntrian(nomorAntrian3);
                    //System.out.print("Nomor Antrian: " + nomorAntrian3);
                    System.out.print("Nama Customer: ");
                    String namaPembeli3 = annisa.nextLine();
                    annisa.nextLine();
                    System.out.print("Nomor Hp: ");
                    String NoHp3 = annisa.nextLine();
                    annisa.nextLine();
                    //Pembeli_3 pembeli3 = new Pembeli_3(nomorAntrian3, namaPembeli3, NoHp3);
                    break;
                    
                case 2:
                    antrianPembeli3.cetakAntrian();
                    break;

                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("-----------------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = annisa.nextInt();
                    annisa.nextLine(); 
                    System.out.print("Pesanan: ");
                    String namaPesanan3 = annisa.nextLine();
                    System.out.print("Harga: ");
                    int harga3 = annisa.nextInt();
                    antrianPembeli3.hapusAntrian();
                    System.out.println("Semua pesanan berhasil dicetak");
                    break;

                case 4: 
                    antrianPembeli3.Pengurutan();
                    break;
                
                case 5:
                    //antrianPemebeli3.hitungTotal();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan 1-6.");
                    break;
            } 
        } while (pilihan != 6);
    }
}