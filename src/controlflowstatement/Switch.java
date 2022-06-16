package controlflowstatement;

//Before Java 7 it accept int,short,byte,long,char
//After that Integer,Short,Byte,Long,String


public class Switch {
    public static void main(String[] args) {
        int ch = 1;
        switch (ch) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("No Matching Found");
        }
    }

}
