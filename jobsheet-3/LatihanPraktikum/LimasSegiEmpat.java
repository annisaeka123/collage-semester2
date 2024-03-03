package LatihanPraktikum;

/**
 * LimasSegiEmpat
 */
public class LimasSegiEmpat {

    public double panjangSisiAlas;
    public double tinggiLimas;
    
    public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas) * Math.sqrt((panjangSisiAlas / 2) * (panjangSisiAlas / 2) + tinggiLimas * tinggiLimas);

    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
    
}