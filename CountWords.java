 public class CountWords {
    public static void main(String[] args) {

        String str = "Hello world welcome to Java";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            // count spaces
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Word count: " + (count + 1));
    }
}