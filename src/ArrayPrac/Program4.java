package ArrayPrac;
//Java Program to print the duplicate elements of an array
public class Program4 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,2,4,5,3};
        System.out.println("Duplicate Element of an Given Array");
        for (int i=0; i< arr.length;i++){
            for (int j=i+1; j< arr.length;j++) {
                if(arr[i]==arr[j]) {
                    System.out.print(arr[j]+ " ");

                }
            }
        }

    }
}
