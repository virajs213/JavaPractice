package ArrayPrac;
//Print array element in odd position
public class Program8 {
    public static void main(String[] args) {
        System.out.println("Odd Position:");
        int arr[]= new int[]{2,4,5,7,8,9,0,1};
        for (int i=0;i< arr.length;i=i+2) {
            System.out.print(arr[i]+" ");
        }
    }
}
