public class PersegiPanjangMain {
    public static void main(String[] args) {
        PersegiPanjang[][] array2D = new PersegiPanjang[3][2];

        array2D[0][0] = new PersegiPanjang(10, 5);
        array2D[0][1] = new PersegiPanjang(15, 8);

        System.out.println("Panjang: " + array2D[0][0].panjang + "\nLebar: " + array2D[0][0].lebar);
    }
}