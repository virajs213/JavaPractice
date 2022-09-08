package String;

public class StringDemo {
    public static void main(String[] args) {
        //By Using Literal
        String str= "Pune";
        String str3= "Pune";
        //By using new Keyword
        String str2= new String("Pune");
        String str4= new String("Pune");
        if (str==str4) { //Check Whether Strings having contains of the Object.

            System.out.println("Both Strings are equal");
        } else
            System.out.println("Different Strings");
        if (str.equals(str2)) {
            System.out.println("Equals");
        } else  {
            System.out.println("not Equals");
        }
        }
    }

