package LatihanPraktikum;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public void tampilkanInformasi(String nama, String nim, char jk, double ipk) 
    {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
}