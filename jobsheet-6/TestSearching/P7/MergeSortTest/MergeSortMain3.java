package MergeSortTest;

public class MergeSortMain3 {
    public static void main(String[] args) {
        String data[] = {"10", "40", "30", "50", "70", "20", "100", "90"};
        System.out.println("Sorting dengan merge sort");
        MergeSorting3 mSort = new MergeSorting3();
        System.out.println("Data awal");
        mSort.printArray(data); 
        mSort.MergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);

        String keySequential = "50";
        int indexSequential = mSort.sequentialSearch(data, keySequential);
        if (indexSequential != -1) {
            System.out.println("Pencarian Sequential: Kode " + keySequential + " ditemukan di indeks " + indexSequential);
        } else {
            System.out.println("Pencarian Sequential: Kode " + keySequential + " tidak ditemukan");
        }

        String keyBinary = "50";
        int indexBinary = mSort.binarySearch(data, keyBinary);
        if (indexBinary != -1) {
            System.out.println("Pencarian Binary: Kode " + keyBinary + " ditemukan di indeks " + indexBinary);
        } else {
            System.out.println("Pencarian Binary: Kode " + keyBinary + " tidak ditemukan");
        }
    }
   
}