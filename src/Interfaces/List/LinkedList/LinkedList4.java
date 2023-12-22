package Interfaces.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println(linkedList);
        Iterator itr = linkedList.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
    }
}
