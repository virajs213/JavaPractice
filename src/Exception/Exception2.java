package Exception;

import java.util.Locale;

//NullPointerException
//ArrayINdexOfBound

public class Exception2 {
    public static void main(String[] args) {
        String name=null;
        //System.out.println(name.toLowerCase());
        int a[]= {1,2,3,4,5};
        System.out.println(a[6]);
    }
}
