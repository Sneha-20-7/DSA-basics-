import java.util.*;
public class Practice{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st string");
    String s1 = sc.nextLine();
    System.out.println("Enter 2nd string");
    String s2 = sc.nextLine();

    s1=s1.replaceAll("\\s","").toLowerCase();
    s2=s2.replaceAll("\\s","").toLowerCase();
       
    
    if(s1.length()!=s2.length()){
        System.out.println("Not Anagram");
        return;
    }
    char[] arr1=s1.toCharArray();
    char[]  arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if(Arrays.equals(arr1,arr2)){
        System.out.println("Anagram");
    }
    else{
        System.out.println("Not Anagram");
    }
    }
}