package Interfaces.Set.SortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("A");
        treeSet1.add("B");
        treeSet1.add("C");
        treeSet1.add("D");
        treeSet1.add("E");
        treeSet1.add("F");
        treeSet1.add("G");
        treeSet1.add("H");
        treeSet1.add("I");
        treeSet1.add("J");

        System.out.println("initial Set: "+treeSet1);
        System.out.println("initial Set: "+treeSet1.subSet("B","E"));
        System.out.println("Head Set: "+treeSet1.headSet("D"));
        System.out.println("Tail Set: "+treeSet1.tailSet("C"));
        System.out.println("reversed Set: "+treeSet1.reversed());
    }
}
