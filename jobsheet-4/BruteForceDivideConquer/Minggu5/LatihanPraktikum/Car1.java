/**
 * Car1
 */
public class Car1 {

    public String merk, tipe;
    public int tahun, top_acceleration, top_power;

    public Car1 (String merk, String tipe, int tahun, int top_acceleration, int top_power){
        this.merk = merk;
        this.tipe= tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int accelerationTertingi(Car1[] mobil, int awal, int akhir) {
        if (awal == akhir) {
            return mobil[awal].top_acceleration;
        }
    
        int tengah = (awal + akhir) / 2;
    
        int maxKiri = accelerationTertingi(mobil, awal, tengah);
        int maxKanan = accelerationTertingi(mobil, tengah + 1, akhir);
    
        return Math.max(maxKiri, maxKanan);
    }
}