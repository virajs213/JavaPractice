package ArrayPrac;
//Java Program to left rotate the elements of an array

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
      int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
      //Store the first Element in temp
        int temp=a[0];
        for (int i = 1; i<a.length; i++) {
            a[i-1]=a[i];


        }
        a[a.length-1]=temp;
        System.out.println();
        for (int i:a) {
            System.out.println(i);


        }

    }
}
