package controlflowstatement;
import java.util.Scanner;
public class PracticeScanner {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        a = sc.nextInt();
        System.out.println("Enter Second Number :");
        b = sc.nextInt();
        System.out.println("Enter Third Number :");
        c = sc.nextInt();
        //Largest Number
        if (a >= b && a >= c) {
            System.out.println(a + "is largest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + "is largest number");
        } else {
            System.out.println(c + " is largest number");
        }
        //Smallest Number-
        if (a <= b && a <= c) {
            System.out.println(a + " is smallest number");
        } else if (b <= a && b <= c) {
            System.out.println(b + "is smallest number");
        } else {
            System.out.println(c   +   "    is smallest number");
        }
    }
}
