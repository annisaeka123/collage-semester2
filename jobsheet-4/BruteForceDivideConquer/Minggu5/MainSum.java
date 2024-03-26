/**
 * MainSum
 */
import java.util.Scanner;

 public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("\nMasukkan jumlah perusahaan: ");
        int perusahaan = sc.nextInt();
        Sum[] sm = new Sum[perusahaan];

        for (int i = 0; i < perusahaan; i++) {
            System.out.println("\nPerusahaan ke-" + (i+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elemen = sc.nextInt();
            sm[i] = new Sum(elemen);

            System.out.println("=======================================================================");
            for (int j = 0; j < elemen; j++){
                System.out.print("Masukkan untung bulan ke-" + (j+1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }

            System.out.println("===========================================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println("==============================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            }
            
    }
}