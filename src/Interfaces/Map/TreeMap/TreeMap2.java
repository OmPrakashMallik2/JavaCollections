package Interfaces.Map.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "two");
        treeMap.put(4, "four");
        treeMap.put(5, "five");

        for(Map.Entry<Integer, String> tm : treeMap.entrySet()){
            System.out.println(tm.getKey()+" - "+tm.getValue());
        }
        System.out.println("................");
        treeMap.remove(3);
        for(Map.Entry<Integer, String> tm : treeMap.entrySet()){
            System.out.println(tm.getKey()+" - "+tm.getValue());
        }
    }
}
