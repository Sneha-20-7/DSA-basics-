public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1010;
        int decimal = 0, base = 1;

        while(binary > 0){
            int last = binary % 10;
            decimal += last * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);
    }
}