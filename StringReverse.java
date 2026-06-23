package JavaOops;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Nithin";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse of String : " + reversed);
    }
}
