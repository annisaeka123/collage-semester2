public class HotelService{

    Hotel[] rooms;
    int size;

    HotelService(int kapasitas){
        rooms = new Hotel[kapasitas];
        size = 0;
    }
    
    void tambah(Hotel h) {
        if (size < rooms.length) {
            rooms[size++] = h;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            System.out.println("Nama: " + h.nama + ", Kota: " + h.kota + ", Harga: " + h.harga + ", Bintang: " + h.bintang);
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortBintang() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].harga < rooms[minIndex].harga) {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    void selectionSortBintang() {
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].bintang > rooms[maxIndex].bintang) {
                    maxIndex = j;
                }
            }
            Hotel temp = rooms[maxIndex];
            rooms[maxIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}