package ArrayPrac;

public class Program10 {
    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 6, 1, 9, 8,};
        int min = a[0];
        for (int i = 0; i < a.length; i++)
        {

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Largest Number:" + min);
    }
}


