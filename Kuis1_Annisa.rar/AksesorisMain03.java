import java.util.Scanner;

/**
 * AksesorisMain03
 */
public class AksesorisMain03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah aksesoris: ");
        int jmlAks = input.nextInt();
        Aksesoris03[] Aks = new Aksesoris03[jmlAks];

        for (int i = 0; i < jmlAks; i++) {
            System.out.println("Masukkan data aksesoris ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = input.next();
            System.out.print("Masukkan kategori: ");
            String kategori = input.next();
            System.out.print("Masukkan harga: ");
            int harga = input.nextInt();
            System.out.print("Masukkan jumlah terjual: ");
            int terjual = input.nextInt();
            input.nextLine();

            Aks[i] = new Aksesoris03(nama, kategori, harga, terjual);
        }

        System.out.println("\nData Aksesoris: ");
        for (int i = 0; i < jmlAks; i++) {
            System.out.println("Data Aksesoris ke-" + (i+1));
            Aks[i].tampil();
        }

        System.out.println("\nTotal Harga Penjualan: " + Aks[0].hitungTotalPenjualan(Aks));
        Aksesoris03.cariAksesorisTermahal(Aks);
        Aksesoris03.daftarAksesoris(Aks);
        


    }
}