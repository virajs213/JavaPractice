package Exception;

public class Finally {
    public static void main(String[] args) {
        String a=null;
        try {
            System.out.println(10/0);
            System.out.println(a.toLowerCase());
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In finally Code");
        }
        System.out.println("Rest of the Code");
    }
}
