public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}