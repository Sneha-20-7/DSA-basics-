public class RotateRightByOne {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // store last element
        int last = arr[n - 1];

        // shift elements to right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // place last at first
        arr[0] = last;

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}