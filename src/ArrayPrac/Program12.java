package ArrayPrac;
//Print the sum of all the items of the array
public class Program12 {
    public static void main(String[] args) {
        int a[]= new int[]{1,2,3,4,5};
        int sum=0;
        for (int i=0;i<=a.length-1;i++) {
            sum+=a[i];
        }
        System.out.println("Sum of Array:" +sum);
    }
}
