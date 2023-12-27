package Interfaces.Set.SortedSet;

import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=5; i<=15; i++){
            treeSet.add(i);
        }
        System.out.println(treeSet);
        System.out.println("first : "+treeSet.first());
        System.out.println("last : "+treeSet.last());
        System.out.println("headSet : "+treeSet.headSet(10));
        System.out.println("tailSet : "+treeSet.tailSet(10));
        System.out.println("subSet : "+treeSet.subSet(6,12));
        System.out.println(treeSet);
    }
}
