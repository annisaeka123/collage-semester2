package ArrayBalok;

/**
 * Balok
 */
public class Balok {

    public int panjang;
    public int lebar;
    public int tinggi;

    //konstruktor1
    public Balok() {

    }

    //konstruktor2
    public Balok(int p, int l, int t)
    {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
}