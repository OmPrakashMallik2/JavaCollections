package Interfaces.Set.SortedSet.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(15);
        treeSet1.add(20);
        treeSet1.add(25);
        treeSet1.add(30);

        System.out.println(treeSet1);

        Iterator<Integer> itr = treeSet1.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
