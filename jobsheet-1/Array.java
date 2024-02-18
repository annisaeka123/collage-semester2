import java.util.Scanner;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // {matkul, sks}
        String[][] mataKuliah = {
            {"Pancasila", "2"},
            {"Konsep Teknologi Informasi", "2"},
            {"Critical Thinking dan Problem Solving", "2"},
            {"Matematika Dasar", "3"}, 
            {"Bahasa Inggris", "2"},
            {"Dasar Pemrograman", "2"},
            {"Praktikum Dasar Pemrograman", "3"}, 
            {"Keselamatan dan Kesehatan Kerja", "2"}
        };

        int jumlahMatkul = mataKuliah.length;
        double[] nilaiAngka = new double[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double[] bobotNilai = new double[jumlahMatkul];
        double totalSKS = 0, totalBobotNilai = 0;

        System.out.println("\nPROGRAM MENGHITUNG IP SEMESTER\n");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i][0] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            totalSKS += Double.parseDouble(mataKuliah[i][1]);
            totalBobotNilai += bobotNilai[i] * Double.parseDouble(mataKuliah[i][1]);
        }

        // Hitung IP setelah semua mata kuliah selesai diinput
        double IP = totalBobotNilai / totalSKS;

        System.out.println("\n\nHasil Konversi Nilai");

        System.out.printf("\nMK\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");

        System.out.printf("\n%s\t\t\t\t  %s\t\t    %s\t\t   %s", mataKuliah[0][0], nilaiAngka[0], nilaiHuruf[0], bobotNilai[0]);
        System.out.printf("\n%s\t\t  %s\t\t    %s\t\t   %s", mataKuliah[1][0], nilaiAngka[1], nilaiHuruf[1], bobotNilai[1]);        
        System.out.printf("\n%s\t  %s\t\t    %s\t\t   %s", mataKuliah[2][0], nilaiAngka[2], nilaiHuruf[2], bobotNilai[2]);
        System.out.printf("\n%s\t\t\t  %s\t\t    %s\t\t   %s", mataKuliah[3][0], nilaiAngka[3], nilaiHuruf[3], bobotNilai[3]);
        System.out.printf("\n%s\t\t\t\t  %s\t\t    %s\t\t   %s", mataKuliah[4][0], nilaiAngka[4], nilaiHuruf[4], bobotNilai[4]);
        System.out.printf("\n%s\t\t\t  %s\t\t    %s\t\t   %s", mataKuliah[5][0], nilaiAngka[5], nilaiHuruf[5], bobotNilai[5]);
        System.out.printf("\n%s\t\t  %s\t\t    %s\t\t   %s", mataKuliah[6][0], nilaiAngka[6], nilaiHuruf[6], bobotNilai[6]);
        System.out.printf("\n%s\t\t  %s\t\t    %s\t\t   %s\n", mataKuliah[7][0], nilaiAngka[7], nilaiHuruf[7], bobotNilai[7]);

        System.out.printf("\nIP : %.2f \n", IP);

    }
}