package ArrayPrac;

//Finding Frequency of Number in Number
public class Program2 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,2,3,6,7,7};
        int arr2[] = new int[arr.length];
        for (int i =0;i<arr.length;i++) {
            System.out.print(" \t  " +arr[i]);
        }
        for (int i =0;i< arr.length;i++) {
            int count=1;
            for (int j =i+1;j< arr.length;j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    arr2[j] = -1;
                }
            }
            if (arr2[i]!=-1) {
                arr2[i]=count;
            }
        } for (int i=0;i<arr2.length;i++) {
            if (arr2[i]!=-1)
            System.out.println("Number:" + "\t" + arr[i] + "\t frequency" + arr2[i]);
        }
    }
}
