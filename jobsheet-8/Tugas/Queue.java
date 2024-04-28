package Tugas;

/**
 * Queue
 */
public class Queue {

    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen  terdepan: " + antrian[front].nama + " " + antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kososng");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()){
            front = rear = -1;
            size = 0 ;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.out.println("Program dihentikan karena queue overflow.");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = 0;
            }
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli dt = new Pembeli();
        if(IsEmpty()) {
            System.out.println("Queue masih kososng");
            System.out.println("Program dihentikan karena queue underflow.");
            System.exit(0);
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public Pembeli peekRear() {
        if (!IsEmpty()) {
            return antrian[rear];
        } else {
            return null;
        }
    }

    public void peekPosition(String nama) {
        boolean found = false;
        int position = -1;
        for (int i = front; i <= rear; i++) {
            if (antrian[i].nama.equals(nama)) {
                found = true;
                position = i - front + 1;
                break;
            }
        }
        if (found) {
            System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + position);
        } else {
            System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
        }
    }

    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Pembeli:");
            for (int i = front; i <= rear; i++) {
                System.out.println("Nama: " + antrian[i].nama + " - " + "Nomor HP: " + antrian[i].noHp);
            }
        }
    }
}