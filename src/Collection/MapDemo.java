package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Viraj");
        map.put(2, "Sagar");
        map.put(3, "Indra");
        System.out.println(map);
        map.put(3, "Pooja");
        System.out.println(map);
        map.put(null, null);
        map.put(null, "Sony");
        map.put(4, null);
        map.put(5, "Sagar");
        System.out.println(map);
        System.out.println(map.get(5));
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        map.remove(1);
        System.out.println(map);
    }
}
