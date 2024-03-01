package ArrayObjects;
import java.util.Scanner;

/**
 * PersegiPanjang
 */

public class PersegiPanjangMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < panjangArray; i++) {
            System.out.println("============================");
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }


    }
}