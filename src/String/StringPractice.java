package String;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Mumbai";
        if (s1 == s2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(s1.compareTo(s2));

    System.out.println(s1.equalsIgnoreCase(s2));


    }
}
