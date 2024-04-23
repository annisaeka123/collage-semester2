package MergeSortTest;

/**
 * MergeSorting3
 */
public class MergeSorting3 {

    public void MergeSort(String[] data){
        sort(data, 0, data.length - 1);
    }

    public void merge(String data[], int left, int middle, int right) {
        String[] temp = new String[data.length];
        for (int i = left; i <= right; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a].compareTo(temp[b]) <= 0) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(String data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data,  left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }
    

    public void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int sequentialSearch(String[] data, String key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String[] data, String key) {
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = data[mid].compareTo(key);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}