/**
 * Buku03
 */
public class Buku03 {

    String judul, pengarang;
    int halaman, stok, harga, hargaTotal;
    double diskon;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual. Sisa stok: " + stok);
        } else {
            System.out.println("Stok habis. Tidak dapat menjual buku");
        }
    }

    void restok(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int jml) { //jml = jumlah buku terjual
        hargaTotal = jml * harga;
        System.out.println("Harga Total: " + hargaTotal);
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = hargaTotal * 0.05;
        } else {
            diskon = 0;
        }

        System.out.println("Diskon: " + diskon);
    }

    void hitungHargaBayar() {
        hargaTotal -= diskon;
        System.out.println("Harga Bayar: " + hargaTotal);
    }

    public Buku03() {

    }

    public Buku03(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public Buku03(String jud, int stok, int har){
        judul = jud;
        this.stok = stok;
        harga = har;
    }
}