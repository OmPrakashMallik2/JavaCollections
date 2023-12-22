package Interfaces.Set.SortedSet.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(5);

        Iterator<Integer> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
