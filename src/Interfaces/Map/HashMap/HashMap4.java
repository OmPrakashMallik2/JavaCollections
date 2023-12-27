package Interfaces.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"two");
        hashMap.put(4,"four");
        hashMap.put(5,"five");

        for (Map.Entry<Integer, String> m: hashMap.entrySet()){
            System.out.println(m.getKey()+" - "+ m.getValue());
        }

        System.out.println("....................");
        hashMap.replace(3, "three");
        hashMap.replace(1, "single");
        for (Map.Entry<Integer, String> m: hashMap.entrySet()){
            System.out.println(m.getKey()+" - "+ m.getValue());
        }

        System.out.println("....................");
        hashMap.replace(1, "single", "new one");
        for (Map.Entry<Integer, String> m: hashMap.entrySet()){
            System.out.println(m.getKey()+" - "+ m.getValue());
        }

        System.out.println("....................");
        hashMap.replaceAll((key, value) -> "number");
        for (Map.Entry<Integer, String> m: hashMap.entrySet()){
            System.out.println(m.getKey()+" - "+ m.getValue());
        }
    }
}
