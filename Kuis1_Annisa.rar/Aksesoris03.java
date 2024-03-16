/**
 * Aksesoris03
 */
public class Aksesoris03 {

    public String nama;
    public String kategori;
    public int harga;
    public int terjual;

    public Aksesoris03() {

    }

    public Aksesoris03(String nama, String kategori, int harga, int terjual) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.terjual = terjual;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Terjual: " + terjual);
    } 

    public int hitungTotalPenjualan(Aksesoris03[] Aks) {
        int totalHarga = 0;
        for (int i = 0; i < Aks.length; i++) {
            Aksesoris03 aksesoris = Aks[i];
            totalHarga += aksesoris.terjual * aksesoris.harga;
        }
        return totalHarga;
    }

    public static void cariAksesorisTermahal(Aksesoris03[] Aks){
        Aksesoris03 termahal = Aks[0];
        for (int i = 0; i < Aks.length; i++) {
            Aksesoris03 aksesoris = Aks[i];

            if (aksesoris.harga > termahal.harga) {
                termahal = aksesoris;
            }
        }

        System.out.print("Aksesoris Termahal: " + termahal);
    }

    public static void daftarAksesoris(Aksesoris03[] Aks) {
        int n = Aks.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (Aks[j].terjual < Aks[j + 1].terjual) {
                    Aksesoris03 temp = Aks[j];
                    Aks[j] = Aks[j + 1];
                    Aks[j + 1] = temp;
                }
            }
        }

        System.out.println("Daftar Aksesoris secara descending: ");

        for (int i = 0; i < Aks.length; i++) {
            System.out.println("Data Aksesoris ke-" + (i + 1));
            Aks[i].tampil();
        }
    }
}