package Exception;

public class ArrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        try {
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            System.out.println(a[3]);
            System.out.println(a[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
               e.printStackTrace();
        }
    }
}
