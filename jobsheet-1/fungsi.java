
/**
 * fungsi
 */
public class fungsi {

    private static int[] hargaBunga = {75000, 50000, 60000, 10000};

    private static int jumlahCabang = 4;
    private static int jumlahJenisBunga = 4;

    private static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    private static int[] penguranganStock = {-1, -2, 0, -5};

    private static void tampilkanPendapatan() {

        System.out.println("Pendapatan Setiap Cabang jika Bunga Habis Terjual:");

        for (int cabang = 0; cabang < jumlahCabang; cabang++) {
            int pendapatanCabang = 0;

            for (int jenisBunga = 0; jenisBunga < jumlahJenisBunga; jenisBunga++) {
                pendapatanCabang += stockBunga[cabang][jenisBunga] * hargaBunga[jenisBunga];
            }

            System.out.println("Royal Garden " + (cabang + 1) + ": " + pendapatanCabang);
            
        }

    }

    private static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    private static void tampilkanStockPerJenisBunga(int cabang) {
        System.out.println("\nStock Bunga Royal Garden " + cabang + ":");
        for (int jenisBunga = 0; jenisBunga < jumlahJenisBunga; jenisBunga++) {
            System.out.println("Bunga " + namaBunga[jenisBunga] + ": " + stockBunga[cabang - 1][jenisBunga]);
        }
    }

    private static void updateStockSetelahMati() {
        for (int jenisBunga = 0; jenisBunga < jumlahJenisBunga; jenisBunga++) {
            stockBunga[3][jenisBunga] += penguranganStock[jenisBunga];
        }
    }

    public static void main(String[] args) {
        tampilkanPendapatan();
        tampilkanStockPerJenisBunga(4);
        updateStockSetelahMati();

        // Menampilkan stock setelah update
        System.out.println("\nStock Bunga Royal Garden 4 setelah pengurangan stock karena bunga mati:");
        for (int jenisBunga = 0; jenisBunga < jumlahJenisBunga; jenisBunga++) {
            System.out.println("Bunga " + namaBunga[jenisBunga] + ": " + stockBunga[3][jenisBunga]);
        }
    }
}