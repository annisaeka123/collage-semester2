package Tugas;

import java.util.Scanner;

/**
 * QueueMain
 */
public class QueueMain {

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Cek posisi antrian");
        System.out.println("7. Daftar seluruh pembeli");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    int noHp = sc.nextInt();
                    Pembeli pm = new Pembeli(nama, noHp);
                    sc.nextLine();
                    antri.Enqueue(pm);
                    break;

                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noHp)) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;
                
                case 5:
                    Pembeli rearData = antri.peekRear();
                    if (rearData != null) {
                        System.out.println("Antrian paling belakang: " + rearData.nama + " " + rearData.noHp);
                    } else {
                        System.out.println("Queue masih kosong");
                    }
                    break;
                    
                case 6:
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.nextLine();
                    antri.peekPosition(namaPembeli);
                    break;
                
                case 7:
                    antri.daftarPembeli();
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}