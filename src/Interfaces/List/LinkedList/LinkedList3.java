package Interfaces.List.LinkedList;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(12);
        linkedList1.add(13);
        linkedList1.add(14);
        linkedList1.add(12);
        linkedList1.add(15);
        linkedList1.add(12);
        linkedList1.add(16);
        System.out.println(linkedList1);
        linkedList1.removeFirstOccurrence(12);

        linkedList1.remove();
        System.out.println(linkedList1);


        linkedList1.removeFirst();
        System.out.println(linkedList1);

        linkedList1.remove(1);
        System.out.println(linkedList1);

    }
}
