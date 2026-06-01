public class MergeArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        // copy arr1
        for (int i = 0; i < n1; i++) {
            result[i] = arr1[i];
        }

        // copy arr2
        for (int i = 0; i < n2; i++) {
            result[n1 + i] = arr2[i];
        }

        // print
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}