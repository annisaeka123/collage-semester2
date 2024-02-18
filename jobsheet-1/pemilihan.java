import java.util.Scanner;

/**
 * pemilihan
 */
public class pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean batasNilai;
        double ketNIlaiTugas = 0.2, ketNilaiKuis = 0.2, ketNilaiUTS = 0.3, ketNilaiUAS = 0.3, nilaiAkhir;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        String nilaiHuruf;
        
        System.out.println("\nProgram Menghitung Nilai Akhir\n");
        
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = input.nextInt();

        batasNilai = (0 <= nilaiTugas && nilaiTugas <= 100 && 0 <= nilaiKuis && nilaiKuis <= 100 && 0 <= nilaiUTS && nilaiUTS <= 100 && 0 <= nilaiUAS && nilaiUAS <= 100); 

        if (!batasNilai) {

            System.out.println("\n\nnilai tidak valid\n\n");
        } else {

            nilaiAkhir = (nilaiTugas * ketNIlaiTugas) + (nilaiKuis * ketNilaiKuis) + (nilaiUTS * ketNilaiUTS) + (nilaiUAS * ketNilaiUAS);

            nilaiHuruf =  (nilaiAkhir > 80 && nilaiAkhir <= 100) ? "A" 
                        : (nilaiAkhir > 73) ? "B+" 
                        : (nilaiAkhir > 65) ? "B" 
                        : (nilaiAkhir > 60) ? "C+"
                        : (nilaiAkhir > 50) ? "C"
                        : (nilaiAkhir > 39) ? "D"
                        : "E";

            System.out.println("\n\nNilai Akhir = "+nilaiAkhir);
            System.out.println("Nilai Huruf = "+nilaiHuruf+"\n\nSELAMAT ANDA LULUS");
        }

    }
    
}