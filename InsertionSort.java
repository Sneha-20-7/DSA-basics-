public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key
            arr[j + 1] = key;
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}