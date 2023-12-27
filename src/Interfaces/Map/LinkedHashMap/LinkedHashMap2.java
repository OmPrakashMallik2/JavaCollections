package Interfaces.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap2 {
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

        //fetching key
        System.out.println("keys: "+linkedHashMap.keySet());
        System.out.println("value: "+linkedHashMap.values());
        System.out.println("key-value: "+linkedHashMap.entrySet());
    }
}
