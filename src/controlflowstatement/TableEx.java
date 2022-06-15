package controlflowstatement;

import java.util.Scanner;

public class TableEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
       int no = sc .nextInt();
//        for (int i = 1;i<=10;i++) {
//            System.out.println(no * i);
        for (int i=0;i<no;i++){
            for (int j=0;j<no;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
