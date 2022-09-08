package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<String> cities = new LinkedList<>();
        Deque<String> cities1 = new ArrayDeque<>();
        cities.addFirst("Pune");
        cities.addFirst("Mumbai");
        cities.addLast("Ooty");
        cities.offerFirst("Kolkata");
        System.out.println(cities);
    }
}
