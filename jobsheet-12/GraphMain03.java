/**
 * GraphMain03
 */
import java.util.Scanner;

 public class GraphMain03 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph03 gedung03 = new Graph03(6);
        gedung03.addEdge1(0, 1, 50);
        gedung03.addEdge1(0, 2, 100);
        gedung03.addEdge1(1, 3, 70);
        gedung03.addEdge1(2, 3, 40);
        gedung03.addEdge1(3, 4, 60);
        gedung03.addEdge1(4, 5, 80);
        gedung03.degree1(0);
        gedung03.printGraph();

        gedung03.removeEdge(1,  3);
        gedung03.printGraph();

        //modif pertanyaan 5 percobaan 1
        while (true) {
            System.out.print("Masukkan gedung asal (-1 untuk keluar)        : ");
            int asal = sc.nextInt();
            if (asal == -1) {
                break;
            }
            System.out.print("Masukkan gedung tujuan (-1 untuk keluar)     : " );
            int tujuan = sc.nextInt();
            if (tujuan == -1) {
                break;
            }
            gedung03.tetangga(asal, tujuan);
            System.out.println();
        }
    }
}