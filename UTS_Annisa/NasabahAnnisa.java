/**
 * NasabahAnnisa
 */
public class NasabahAnnisa {

    String norekAnnisa;
    String namaAnnisa;
    String nikAnnisa;
    int umurAnnisa;
    double saldoAnnisa;

    public NasabahAnnisa(String norekAnnisa, String namaAnnisa, String nikAnnisa, int umurAnnisa, double saldoAnnisa) {
        this.norekAnnisa = norekAnnisa;
        this.namaAnnisa = namaAnnisa;
        this.nikAnnisa = nikAnnisa;
        this.umurAnnisa = umurAnnisa;
        this.saldoAnnisa = saldoAnnisa;
    }

    public void tampilDataNasabah() {
        System.out.println("==========================");
        System.out.println("No Rekening     : " + norekAnnisa);
        System.out.println("Nama            : " + namaAnnisa);
        System.out.println("NIK             : " + nikAnnisa);
        System.out.println("Umur            : " + umurAnnisa);
        System.out.println("Saldo           : " + saldoAnnisa);

    }

    
}

