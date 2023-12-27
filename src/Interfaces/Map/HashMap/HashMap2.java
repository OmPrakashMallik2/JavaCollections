package Interfaces.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Om Prakash Mallik");
        hashMap.put(4, "Sachin Kr. Mallik 2");
        hashMap.put(2, "Jay Prakash Mallik");
        hashMap.put(3, "Sachin Kr. Mallik");
        hashMap.put(null,"Sachin Kr. Mallik");

        for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        System.out.println(".............................");
        hashMap.putIfAbsent(5, "Roll - 5");
        hashMap.putIfAbsent(2, "Roll - 2");
        for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }


        System.out.println(".............................");
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(6, "six");
        hashMap2.put(1, "six");
        hashMap2.put(7, "seven");
        hashMap2.put(8, "eight");
        hashMap.putAll(hashMap2);
        for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
