public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int[] result = new int[arr.length];

        int index = 0;

        // copy non-zero elements
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        // remaining elements are already 0
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}