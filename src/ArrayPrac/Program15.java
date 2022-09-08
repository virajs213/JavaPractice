package ArrayPrac;
////Program to Sort the elements of an array in Descending order
public class Program15 {
    public static void main(String[] args) {
        int a[]=new int[] {2,1,7,5,0,9,8};
        int temp=0;
        System.out.println("Enter an Original Array:");
        for (int i=0;i<a.length;i++) {
            System.out.print("\t"+a[i]);
        }
        System.out.println("Ascending Array is:");
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if(a[i]<a[j]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        for (int i=0;i<a.length;i++) {
            System.out.print("\t"+a[i]);
        }
    }
}
