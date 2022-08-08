package ArrayPrac;
//print the elements of an array in reverse order
public class Program6 {
    public static void main(String[] args) {
        int a[] = new int[] {3,4,5,6,9,8,0};
        System.out.println("Original Array:");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Array :");
        for (int i=a.length-1;i>=0;i--) {
            System.out.print(a[i]+" ");

        }
    }

}
