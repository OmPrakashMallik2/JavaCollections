package Interfaces.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Om Prakash Mallik");
        hashMap.put(4, "Sachin Kr. Mallik 2");
        hashMap.put(2, "Jay Prakash Mallik");
        hashMap.put(3, "Sachin Kr. Mallik");

        for (Map.Entry<Integer, String> m : hashMap.entrySet()){
            System.out.println(m.getKey()+ " - "+m.getValue());
        }
        System.out.println(hashMap.keySet());
    }
}
