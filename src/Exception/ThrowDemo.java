package Exception;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        try {
            validateAge(age);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(int age) {
        if (age<18 || age>55) {
            throw new ArithmeticException("You are eligible for Vaccine");
        }
        else {
            System.out.println("You are Eligible for Vaccine");
        }
    }
}
