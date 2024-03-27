/**
 * MainCar3
 */
public class MainCar3 {

    public static void main(String[] args) {
            Car3[] car = new Car3[8];
            car[0] = new Car3("BMW", "M2 Coupe", 2016, 6816, 762);
            car[1] = new Car3("Ford", "Fiesta ST", 2014, 3921, 575);
            car[2] = new Car3("Nissan", "370Z", 2009, 4360, 657);
            car[3] = new Car3("Subaru", "BRZ", 2014, 4058, 609);
            car[4] = new Car3("Subaru", "Impreza WRX STI", 2013,6255, 703);
            car[5] = new Car3("Toyota", "AE86 Trueno", 1986, 3700, 553);
            car[6] = new Car3("Toyota", "86/GT86", 2014, 4180, 609);
            car[7] = new Car3("Volkswagen", "Golf GTI", 2014, 4180, 631);
    
            Car3 car3 = new Car3("", "", 0, 0, 0); 
            double rataRata = car3.rataRataTopPower(car);
            System.out.println("Rata-rata Top Power: " + rataRata);
        
    }
}