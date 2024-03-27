/**
 * MainCar2
 */
public class MainCar2 {

    public static void main(String[] args) {
        Car2[] car = new Car2[8];
        car[0] = new Car2("BMW", "M2 Coupe", 2016, 6816, 762);
        car[1] = new Car2("Ford", "Fiesta ST", 2014, 3921, 575);
        car[2] = new Car2("Nissan", "370Z", 2009, 4360, 657);
        car[3] = new Car2("Subaru", "BRZ", 2014, 4058, 609);
        car[4] = new Car2("Subaru", "Impreza WRX STI", 2013,6255, 703);
        car[5] = new Car2("Toyota", "AE86 Trueno", 1986, 3700, 553);
        car[6] = new Car2("Toyota", "86/GT86", 2014, 4180, 609);
        car[7] = new Car2("Volkswagen", "Golf GTI", 2014, 4180, 631);
    
        int accelerationTerendah = car[0].accelerationTerendah(car, 0, car.length - 1);
System.out.println("Top Acceleration Terendah: " + accelerationTerendah);
    }
}