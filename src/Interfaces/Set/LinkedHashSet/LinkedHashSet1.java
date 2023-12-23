package Interfaces.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(11);
        linkedHashSet.add(12);
        linkedHashSet.add(10);
        linkedHashSet.add(11);

        System.out.println(linkedHashSet);

        Iterator<Integer> itr = linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
