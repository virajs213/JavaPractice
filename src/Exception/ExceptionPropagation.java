package Exception;

public class ExceptionPropagation {
    void m1() {
        int result = 10/0;
        //throw new UserDefinedException("User Defined Exception");
    }
    void m2() {
        m1();
    }
    void  m3() {
        try {
            m2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining Code");
    }

    public static void main(String[] args) {


        ExceptionPropagation demo =new ExceptionPropagation();
        demo.m3();
    }
}

