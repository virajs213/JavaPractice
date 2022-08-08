package ArrayPrac;
//Print Array Element in an Even Position
public class Program7 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,3,2,4,7,9,11,34};
        System.out.print("Even Position: ");
        for (int i=1; i<= arr.length;i=i+2) {
            System.out.println(arr[i]);
        }
    }
}
