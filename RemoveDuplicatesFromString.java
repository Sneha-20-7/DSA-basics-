import java.util.*;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";

        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}
