package String;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        String original;
        String rev = "";
        System.out.println("Enter a string to reverse:  ");
        Scanner scanner = new Scanner(System.in);
        original=scanner.nextLine();
        int len = original.length();
        for (int i=len-1;i>=0;i--) {
            rev=rev+original.charAt(i);
        }
        System.out.println("Orignal String:" +original);
        System.out.println("Reverse String:" +rev);
    }
}


