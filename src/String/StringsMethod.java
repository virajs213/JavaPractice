package String;

public class StringsMethod {
    public static void main(String[] args) {
        String str= "codekul,Codekul";
        System.out.println("Upper Case:"+str.toLowerCase());
        System.out.println("Lower Case:"+str.toUpperCase());
        System.out.println("Char At:"+str.charAt(3));
        System.out.println("Concat:"+str.concat("Pvt.Limited"));
        System.out.println("Replace:"+str.replace(str,"Mumbai"));
        System.out.println("Replace All:"+str.replaceAll("codekul","Pune"));
        System.out.println("Contains:"+str.contains("Viraj  "));
        //
    }
}
