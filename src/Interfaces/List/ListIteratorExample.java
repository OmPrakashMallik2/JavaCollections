package Interfaces.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        java.util.List<Integer> list = new ArrayList<>();
        list.add(75);
        list.add(20);
        list.add(23);
        list.add(98);
        list.add(53);
        list.add(73);
        list.add(52);
        list.add(28);
        list.add(14);
        list.add(93);
        System.out.println(list);

        // ListIteratorExample
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println("index: "+listIterator.nextIndex()+" value: "+listIterator.next());
        }

        System.out.println("Reverse iteration");

        while (listIterator.hasPrevious()){
            System.out.println("index: "+listIterator.previousIndex()+" value: "+listIterator.previous());
        }
    }
}