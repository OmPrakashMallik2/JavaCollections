package Interfaces.Map.Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable3 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"one");
        hashtable.put(2,"two");
        hashtable.put(3,"three");
        hashtable.put(4,"four");
        hashtable.put(6,"six");
        hashtable.put(5,"five");


        for(Map.Entry<Integer,String > ht : hashtable.entrySet()){
            System.out.println(ht.getKey()+" - "+ht.getValue());
        }

        // getOrDefault()

        System.out.println(hashtable.getOrDefault(3,"seven"));
        System.out.println(hashtable.getOrDefault(8,"eight"));
        hashtable.putIfAbsent(9, "nine");

        for(Map.Entry<Integer,String > ht : hashtable.entrySet()){
            System.out.println(ht.getKey()+" - "+ht.getValue());
        }
    }
}
