package Exception;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String n="105A";
        int i=Integer.parseInt(n);
        System.out.println(i+5);
    }
}
