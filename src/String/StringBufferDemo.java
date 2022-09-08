package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Pune");
        buffer.append("Maharashtra");
        System.out.println(buffer);
        StringBuffer buffer1= new StringBuffer("0");
        System.out.println(buffer1.capacity());
    }
}
