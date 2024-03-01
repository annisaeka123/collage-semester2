package ArrayBalok;

/**
 * BalokMain
 */
public class BalokMain {

    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];

        // konstruktor1
        blArray[0] = new Balok();
        blArray[0].panjang = 100;
        blArray[0].lebar = 30;
        blArray[0].tinggi = 12;

        //konstruktor2
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

    }
}