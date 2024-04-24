public class PencarianAnnisa {

    NasabahAnnisa nsb[] = new NasabahAnnisa[6];
    int idx;

    public void tambah(NasabahAnnisa m) {
        if (idx < nsb.length) {
            nsb[idx] = m;
            idx++;
        } else{
            System.out.println("Data penuh!");
        }

    }

    public void tampil() {
        for (NasabahAnnisa m : nsb) {
            m.tampilDataNasabah();
        }
    }

    public int cariData(String cari) {
        int posisi = -1;
        for (int i = 0; i < nsb.length; i++) {
            if (nsb[i].nikAnnisa.equals(cari)){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void TampilData(String x, int pos){
        if (pos!= -1){
            System.out.println("No Rekening : " + nsb[pos].norekAnnisa);
            System.out.println("Nama        : " + nsb[pos].namaAnnisa);
            System.out.println("NIK         : "+ x);
            System.out.println("Umur        : " + nsb[pos].umurAnnisa);
            System.out.println("Saldo       : " + nsb[pos].saldoAnnisa);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void bubbleSort(){
        for(int i=0; i<nsb.length-1; i++){
            for(int j=1; j<nsb.length-i; j++){
                if(nsb[j].saldoAnnisa>nsb[j-1].saldoAnnisa){
                    NasabahAnnisa tmp = nsb[j];
                    nsb[j] = nsb[j-1];
                    nsb[j-1] = tmp;
                }
            }
        }
    }

    public void TampilData2(String x, int pos){
        if (pos!= -1){
            System.out.println("No Rekening : " + nsb[pos].norekAnnisa);
            System.out.println("Nama        : " + nsb[pos].namaAnnisa);
            System.out.println("NIK         : "+ nsb[pos].nikAnnisa);
            System.out.println("Umur        : " + nsb[pos].umurAnnisa);
            System.out.println("Saldo       : " + x);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}