import java.util.Scanner;
/**
 * Utama3
 */
public class Utama3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang3 gudang = new Gudang3(kapasitas);

        while (true) {
            System.out.println("\n================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang3 barangBaru = new Barang3(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                
                case 2:
                    gudang.ambilBarang();
                    break;
                
                case 3:
                    gudang.tampilkanBarang();
                    break; 

                case 4: 
                    gudang.lihatBarangTeratas();
                    break; 

                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                
                case 6:
                    System.out.print("Masukkan kode atau nama barang yang dicari: ");
                    String input = scanner.nextLine();
                    try {
                        int inputKode = Integer.parseInt(input);
                        gudang.cariBarang(inputKode, null);
                    } catch (NumberFormatException e) {
                        gudang.cariBarang(-1, input);
                    }
                    break;
                
                case 7:
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}