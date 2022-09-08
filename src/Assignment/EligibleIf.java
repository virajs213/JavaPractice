package Assignment;

import java.util.Scanner;

public class EligibleIf {
    public static void main(String[] args) {
        System.out.println("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age>=18) {
            System.out.println("You are Adult");
        }
        else {
            System.out.println("You are not Adult");
        }
    }
}
