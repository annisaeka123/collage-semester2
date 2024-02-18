import java.util.Scanner;

/**
 * perulangan
 */
public class perulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Check if n is less than 10
        if (n < 10) {
            n += 10;
        }

        // Print the series
        System.out.print("OUTPUT: ");
        printSeries(n);
    }

    static void printSeries(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}