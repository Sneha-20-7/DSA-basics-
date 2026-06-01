public class Power {
    public static void main(String[] args) {
        int base = 2, exp = 3;
        int result = 1;

        for(int i = 1; i <= exp; i++){
            result *= base;
        }

        System.out.println("Power = " + result);
    }
}
//or int result = (int)Math.pow(2, 3);