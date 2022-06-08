public class Operators {
    public static void main(String[] args) {
        int a = 30;
        boolean flag = false;
        //Increment Decrement Operator
        System.out.println(a++);//30
        System.out.println(--a);//30
        System.out.println(++a);//31
        System.out.println(a--);//31
        //Tilde Operator
        System.out.println(~a); //(-a)-1 = -30-1 = -31
        //Negatation Operator
        System.out.println(!flag);
        //Arithmatic Operator
        int x = 10,y = 20,z = 30;
        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*z);
        System.out.println(z/x);
        System.out.println(z%x);


    }
}
