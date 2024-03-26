/**
 * MainCar1
 */
public class MainCar1 {

    public static void main(String[] args) {
        Car1[] car = new Car1[8];
        car[0] = new Car1("BMW", "M2 Coupe", 2016, 6816, 762);
        car[1] = new Car1("Ford", "Fiesta ST", 2014, 3921, 575);
        car[2] = new Car1("Nissan", "370Z", 2009, 4360, 657);
        car[3] = new Car1("Subaru", "BRZ", 2014, 4058, 609);
        car[4] = new Car1("Subaru", "Impreza WRX STI", 2013,6255, 703);
        car[5] = new Car1("Toyota", "AE86 Trueno", 1986, 3700, 553);
        car[6] = new Car1("Toyota", "86/GT86", 2014, 4180, 609);
        car[7] = new Car1("Volkswagen", "Golf GTI", 2014, 4180, 631);

        int accelerationTertingi = car[0].accelerationTertingi(car, 0, car.length - 1);
System.out.println("Top Acceleration Tertinggi: " + accelerationTertingi);

    }
}