package Interfaces.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(3, "three");
        linkedHashMap.put(4, "three");
        linkedHashMap.put(5, "five");

        for(Map.Entry<Integer, String> m : linkedHashMap.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }
    }
}
