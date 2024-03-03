package LatihanPraktikum;
import java.util.Scanner;

/**
 * BangungRuangMain
 */
public class BangungRuangMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            switch (i) {
                case 0: // Kerucut
                    System.out.println("===== Kerucut =====");
                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = scanner.nextDouble();
                    System.out.print("Masukkan sisi miring: ");
                    double sisiMiring = scanner.nextDouble();

                    Kerucut kerucut = new Kerucut(jariJari, sisiMiring);

                    System.out.println("\nLuas Permukaan: " + kerucut.hitungLuasPermukaan());
                    System.out.println("Volume: " + kerucut.hitungVolume());
                    break;

                case 1: // Limas Segi Empat
                    System.out.println("\n===== Limas Segi Empat =====");
                    System.out.print("Masukkan panjang sisi alas: ");
                    double panjangSisiAlas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiLimas = scanner.nextDouble();

                    LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(panjangSisiAlas, tinggiLimas);

                    System.out.println("\nLuas Permukaan: " + limasSegiEmpat.hitungLuasPermukaan());
                    System.out.println("Volume: " + limasSegiEmpat.hitungVolume());
                    break;

                case 2: // Bola
                    System.out.println("\n===== Bola =====");
                    System.out.print("Masukkan jari-jari: ");
                    jariJari = scanner.nextDouble();

                    Bola bola = new Bola(jariJari);

                    System.out.println("\nLuas Permukaan: " + bola.hitungLuasPermukaan());
                    System.out.println("Volume: " + bola.hitungVolume());
                    break;

                default:
                    System.out.println("Pilihan bangun ruang tidak valid.");
                    break;
            }
            System.out.println();
        }

    }
}