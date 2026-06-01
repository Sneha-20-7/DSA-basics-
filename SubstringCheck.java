public class SubstringCheck {
    public static void main(String[] args) {
        String str = "hello world";
        String sub = "world";

        if(str.contains(sub)){
            System.out.println("Substring found");
        } else {
            System.out.println("Not found");
        }
    }
}