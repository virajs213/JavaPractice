package ArrayPrac;

//Find the Smallest Element in Array
public class Program20 {
    public static void main(String[] args) {
        int arr[]= new int[] {2,1,8,7,4,3};
        int min=0;

        for (int i=0;i< arr.length;i++) {
            System.out.println(" " +arr[i]);
        }
        min=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.print("Smallest Element:"+min);
    }
}
