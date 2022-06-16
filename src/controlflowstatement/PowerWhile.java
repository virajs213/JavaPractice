package controlflowstatement;

public class PowerWhile {
    public static void main(String[] args) {
        int base = 2, Power = 3;
        long result = 1;
        while (Power>0) {
            result *= base;
            Power--;
        }
            System.out.println("Answer:" +" "+result);

    }
}
