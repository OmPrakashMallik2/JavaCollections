package Interfaces.Set.SortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSet6 {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("L"));
        treeSet.add(new StringBuffer("B"));

        System.out.println(treeSet);
        System.out.println("B".compareTo("B"));
    }
}
