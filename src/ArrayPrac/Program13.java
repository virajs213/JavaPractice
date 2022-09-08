package ArrayPrac;

import java.util.Arrays;

// Program to right rotate the elements of an array
public class Program13 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};

        int size = a.length;
        int last = a[size-1];
        for (int i=size-1;i>0;i--) {
            a[i] = a[i-1];

        }
        a[0]=last;
        System.out.println("Right rotate element"+ Arrays.toString(a));
    }
}
