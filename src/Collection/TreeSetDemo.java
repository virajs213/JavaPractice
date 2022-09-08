package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(22);
        numbers.add(11);
        numbers.add(20);
        numbers.add(19);
        numbers.add(17);
        System.out.println(numbers);
        numbers.ceiling(100);
        System.out.println(numbers);


    }
}
