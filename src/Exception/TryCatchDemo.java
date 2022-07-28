package Exception;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a;
        int b;
        int result=0;
        String msg=null;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            result = a / b;
            System.out.println(msg.toLowerCase());
            System.out.println("4");
            System.out.println("5");
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            // System.out.println(e.getMessage());
            System.out.println("str is null");
            msg = "Viraj";
            System.out.println(msg.toLowerCase());
        }
        System.out.println("Result:" +result);
        System.out.println("Rest of the code");
        }
    }

