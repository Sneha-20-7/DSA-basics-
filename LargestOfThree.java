import java.util.*;
public class LargestOfThree {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three number:");
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    int max = Math.max(a, Math.max(b,c));
    System.out.println(max);
   } 
}
