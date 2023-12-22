package Interfaces.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("OPM");
        hashSet.add("JPM");
        hashSet.add("OPM");
        hashSet.add("SKM");
        hashSet.add("SKM");

        Iterator itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
