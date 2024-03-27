/**
 * Car3
 */
public class Car3 {
    public String merk, tipe;
    public int tahun, top_acceleration, top_power;

    public Car3 (String merk, String tipe, int tahun, int top_acceleration, int top_power){
        this.merk = merk;
        this.tipe= tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public double rataRataTopPower(Car3[] car) {
        int totalPower = 0;
        for (int i = 0; i < car.length; i++) {
            totalPower += car[i].top_power;
        }
        return (double) totalPower / car.length;
    }
    
}