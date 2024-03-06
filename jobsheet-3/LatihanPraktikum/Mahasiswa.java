package LatihanPraktikum;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nilai IPK: " + ipk);
        System.out.println();
    }

    public double hitungRataRata(Mahasiswa[] mhs) {
        double totalIpk = 0.0;
        for (int i = 0; i < mhs.length; i++) {
            Mahasiswa mahasiswa = mhs[i];
            totalIpk += mahasiswa.ipk;
        }

        return totalIpk / mhs.length;
    }

    public static void ipkTertinggi(Mahasiswa[] mhs) {
        Mahasiswa ipkMax = mhs[0];
        for (int i = 0; i < mhs.length; i++) {
            Mahasiswa mahasiswa = mhs[i];

            if (mahasiswa.ipk > ipkMax.ipk) {
                ipkMax = mahasiswa;
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi: ");
        ipkMax.tampilkanInformasi();
    }
}