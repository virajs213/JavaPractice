package ArrayPrac;

//Copy one Element of Array into Another Array

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
       int a[] = new int[] {1,2,3,4};
        int b[] = new int[a.length] ;
        for (int i=0; i<a.length;i++)
        {
            b[i]=a[i];
        }
        //printing b elements using foreach loop
        for (int i:b) {
            System.out.print(i+" ");
        }
    }

}
