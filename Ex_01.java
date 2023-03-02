// Ex_01 +Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class Ex_01 {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 3, 5, 2, 8, 2, 4, 5, 7, 4, 2, 3, 4 };

        printString("Before sorted: ");
        printArray(arr);

        sortMethod(arr);

        printString("After sorted: ");
        printArray(arr);
    }

    public static void sortMethod(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            arr[0] = swap(arr[i], arr[i] = arr[0]);
            heapify(arr, i, 0);
        }

    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            arr[i] = swap(arr[largest], arr[largest] = arr[i]);
            heapify(arr, n, largest);
        }
    }

    static int swap(int a, int b) {
        return a;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        printString("");
    }

    public static void printString(String s) {
        System.out.println(s);
    }

}