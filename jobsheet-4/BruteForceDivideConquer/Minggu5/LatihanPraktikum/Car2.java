/**
 * Car2
 */
public class Car2 {

    public String merk, tipe;
    public int tahun, top_acceleration, top_power;

    public Car2 (String merk, String tipe, int tahun, int top_acceleration, int top_power){
        this.merk = merk;
        this.tipe= tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int accelerationTerendah(Car2[] mobil, int awal, int akhir) {
        if (awal == akhir) {
            return mobil[awal].top_acceleration;
        }
        
        int tengah = (awal + akhir) / 2;
        
        int minKiri = accelerationTerendah(mobil, awal, tengah);
        int minKanan = accelerationTerendah(mobil, tengah + 1, akhir);
        
        return Math.min(minKiri, minKanan);
    }
}