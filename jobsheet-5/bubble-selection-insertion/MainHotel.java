public class MainHotel{

    public static void main(String[] args) {
        HotelService hotelService = new HotelService(5);
        hotelService.tambah(new Hotel("Hotel A", "Kota A", 100, (byte) 3));
        hotelService.tambah(new Hotel("Hotel B", "Kota B", 200, (byte) 4));
        hotelService.tambah(new Hotel("Hotel C", "Kota C", 150, (byte) 5));
        hotelService.tambah(new Hotel("Hotel D", "Kota D", 250, (byte) 2));
        hotelService.tambah(new Hotel("Hotel E", "Kota E", 180, (byte) 1));

        hotelService.bubbleSortHarga();
        System.out.println("Sortir berdasarkan harga (bubble sort):");
        hotelService.tampilAll();

        hotelService.bubbleSortBintang();
        System.out.println("\nSortir berdasarkan rating bintang (bubble sort):");
        hotelService.tampilAll();

        hotelService.selectionSortHarga();
        System.out.println("\nSortir berdasarkan harga (selection sort):");
        hotelService.tampilAll();

        hotelService.selectionSortBintang();
        System.out.println("\nSortir berdasarkan rating bintang (selection sort):");
        hotelService.tampilAll();

    }
}