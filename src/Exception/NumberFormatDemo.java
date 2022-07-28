package Exception;

public class NumberFormatDemo {
    public static void main(String[] args) {
        String a="123a";
        try {
            int i=Integer.parseInt(a);
            System.out.println(a);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
