import java.util.*;

public class IntersectionTwoPointer {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }

        System.out.println(result);
    }
}