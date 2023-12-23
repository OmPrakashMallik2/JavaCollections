package Interfaces.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("one"); // cant repeat
        hashSet.add("four");
        hashSet.add("five");

        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
