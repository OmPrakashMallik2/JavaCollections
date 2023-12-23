package Interfaces.Map.HashMap;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101,"OPM");
        hashMap.put(102,"JPM");
        hashMap.put(103,"SKM");
        System.out.println(hashMap);

        for(HashMap.Entry map: hashMap.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
