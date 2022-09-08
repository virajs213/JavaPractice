package Assignment;

import java.util.Scanner;

//Sum of N natural numbers..........
public class SumOfNaturalno {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
