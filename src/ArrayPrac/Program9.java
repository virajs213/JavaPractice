package ArrayPrac;
//Java Program to print the largest element in an array
public class Program9 {
    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 6, 1, 9, 8,};
        int max = a[0];
        for (int i = 0; i < a.length; i++)
        {

            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Largest Number:" + max);
    }
}
