
/**
 * AntrianPembeli_3
 */
public class AntrianPembeli_3 {

    Node_3 head3;
    Node_3 tail3;
    int size3;
    int pesananCount3;
    int nomorAntrian3 = 1;

    public AntrianPembeli_3() {
        head3 = null;
        tail3 = null;
        size3 = 0;
    }

    //add
    void tambahAntrian(Node_3 prev3, int pembeli3, Node_3 next3, int nomorAntrian3) {
        Node_3 newNode3 = new Node_3(prev3, pembeli3, next3);
        if (head3 == null) {
            head3 = newNode3;
            tail3 = newNode3;
        } else {
            tail3.next3 = newNode3;
            newNode3.prev3= tail3;
            tail3 = newNode3;
        }
        size3++;
    }

    //get
    void cetakAntrian() {
        System.out.println("-----------------------------------------");
        System.out.println("Daftar Antrian Resto");
        System.out.println("-----------------------------------------");
        Node_3 current3 = head3;
        int nomorAntrian3 = 1;
        while (current3 != null) {
            //System.out.println(nomorAntrian3 + ".\t" + current3.Pembeli_3.namaPembeli3 + "\t\t" + current3.Pembeli_3.NoHp3);
            current3 = current3.next3;
            nomorAntrian3++;
        }
        System.out.println("Total Antrian: " + size3);
    }

    //remove
    void hapusAntrian() {
        Node_3 current3 = head3;
        while (current3 != null) {
            if (nomorAntrian3 == 1) {
                head3 = head3.next3;
                if (head3 != null) {
                    head3.prev3 = null;
                } else {
                    tail3 = null;
                }
                size3--;
                break;
            } else if (nomorAntrian3 == size3) {
                tail3 = tail3.prev3;
                tail3.next3 = null;
                size3--;
                break;
            } else if (nomorAntrian3 == 1 && nomorAntrian3 <size3) {
                Node_3 temp3 = current3.next3;
                current3.prev3.next3 = temp3;
                temp3.prev3 = current3.prev3;
                size3--;
                break;
            }
            current3 = current3.next3;
        }
    }

    void Pengurutan() {
        Node_3 current3 = head3;
        boolean j3;
        do {
            j3 = false;
            while (current3 != null && current3.next3 != null) {
                //if (current3.Pembeli_3.namaPembeli3.compareTo(current3.next3.Pembeli_3.namaPembeli3) > 0) {
                    //Pembeli_3 temp3 = current3.pembeli3;
                    current3.pembeli3 = current3.next3.pembeli3;
                    //current3.next3.pembeli3 = temp3;
                    j3 = true;
                //}
                current3 = current3.next3;
            }
            current3 = head3;
        } while (j3);
    
        System.out.println("-----------------------------------------");
        System.out.println("Daftar Pesanan Resto");
        System.out.println("-----------------------------------------");
        System.out.println("|No.\t|Nama Pesanan\t|Harga");
        int nomorPesanan3 = 1;
        //while (current3 != null) {
            //System.out.println("|" + nomorPesanan3 + ".\t|" + current3.Pembeli_3.namaPembeli3 + "\t\t|" + current3.Pembeli_3.NoHp3);
            current3 = current3.next3;
        //}
    }

    void hitungTotal() {
        //Total harga dari seluruh pesanan
    }
}