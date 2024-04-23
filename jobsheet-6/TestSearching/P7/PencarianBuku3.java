public class PencarianBuku3 {

    Buku3 listBk[] = new Buku3[5];
    int idx;

    void tambah(Buku3 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku3 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindSeqSearchJ(String cariJ) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(cariJ)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos){
        if (pos!= -1){
            System.out.println("Data-" + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data-" + x + " tidak ditemukan");
        }
    }

    public void tampilPosisiJ(String judul, int pos, int jumlah) {
        if (jumlah == 1 && pos != -1) {
            System.out.println("Data " + judul + " ditemukan pada indeks " + pos);
        } else if (jumlah == 0) {
            System.out.println("Data " + judul + " tidak ditemukan");
        } else {
            System.out.println("Peringatan: terdapat lebih dari satu buku dengan judul " + judul + ".");
        }
    }

    public void TampilData(String x, int pos){
        if (pos!= -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+ listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t  : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilDataJ(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku : " + listBk[pos].kodeBuku);
            System.out.println("Judul : " + x);
            System.out.println("Tahun Terbit : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk[pos].pengarang);
            System.out.println("Stock : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public Buku3 FindBuku(String cari) {
        for (Buku3 m  : listBk) {
            if (m.kodeBuku.equals(cari)) {
                return m;
            }
        }
        return null;
    }

    public Buku3 FindBukuJ(String cariJ) {
        for (Buku3 m : listBk) {
            if (m.judulBuku.equals(cariJ)) {
                return m;
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (right + left) / 2; 
            if (cari.equals(listBk[mid].kodeBuku)){
                return (mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch (cari, mid + 1, right);
            } else {
                return FindBinarySearch (cari, left, mid - 1); 
            }
        }
        return -1;
    }

    public int FindBinarySearchJ(String cariJ, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cariJ.equals(listBk[mid].judulBuku)) {
                return (mid);
            } else if (listBk[mid].judulBuku.compareTo(cariJ) > 0) {
                return FindBinarySearchJ(cariJ, mid + 1, right);
            } else {
                return FindBinarySearchJ(cariJ, left, mid - 1);
            }
        }
        return -1;
    }

    public void bubbleSort() {
        int n = idx;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j+1].judulBuku) > 0) {
                    Buku3 temp = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = temp;
                }
            }
        }
    }
}