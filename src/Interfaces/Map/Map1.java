package Interfaces.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("OPM", 23);
        map.put("JPM", 21);
        map.put("SKM", 19);
        System.out.println(map);

        // now for the traversal of the hashmap
        // convert it to set using entrySet()


        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
