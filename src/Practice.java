public class Practice {
    public static void main(String[] args) {
        String n = null;
        try {
            System.out.println("I am in try");
            System.out.println(n.length());
        } catch (Exception e) {
            //int n=10/0;
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e1) {
                System.out.println(e1.getMessage());
            }

        }
        finally {
            String num = "123A";
            try {
                System.out.println(Integer.parseInt(num));
            } catch (NumberFormatException e2) {
                System.out.println("Given String contains alphabets");
            }
        }
        System.out.println("rest of the Code");
    }
}
