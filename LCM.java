import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt(), b = sc.nextInt();
        int x = a, y =b;
        while(y!=0){
            int temp = y;
            y=x%y;
            x = temp;  
        }
        int gcd = x;
        int LCM= (a*b)/gcd;
        System.out.println(LCM);
    }
}
