package LatihanPraktikum;
import java.util.Scanner;

/**
 * MahasiswaMain
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah Mahasiswa: ");
        int mhsArray = input.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[mhsArray];
        
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.println("Masukkan nama: ");
            mhs[i].nama = input.next();
            System.out.println("Masukkan NIM: ");
            mhs[i].nim = input.next();
            System.out.println("Masukkan jenis kelamin: ");
            mhs[i].jenisKelamin = input.next().charAt(0);
            System.out.println("Masukkan IPK: ");
            mhs[i].ipk = input.nextDouble();

        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("Nilai IPK: " + mhs[i].ipk);

        }

        //Mahasiswa[] mahasiswa = new Mahasiswa[mhsArray];
        //mahasiswa = mhs;
        System.out.println("\n Rata - rata IPK: " + mhs[0].hitungRataRata(mhs));
        Mahasiswa.ipkTertinggi(mhs);
        //ystem.out.println("\n IPK tertinggi didapat oleh mahasiswa ke-" + mhs[0].ipkTertinggi(mhs));
    }
}