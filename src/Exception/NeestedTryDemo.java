package Exception;

public class NeestedTryDemo {
    public static void main(String[] args) {
        String a=null;
        try{
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            try {
                System.out.println(10/0);
            }
            catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(a.toLowerCase());
            System.out.println("Rest of the Code");

        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the Code 2");
    }
}
