package Interfaces.List.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("one");
        linkedList1.add("two");
        linkedList1.add("three");
        linkedList1.add("four");
        linkedList1.add("five");
        System.out.println(linkedList1);

        linkedList1.add(1, "single");
        System.out.println(linkedList1);

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("A");
        linkedList2.add("B");
        linkedList2.add("C");
        System.out.println(linkedList2);

        linkedList1.addAll(2,linkedList2);
        System.out.println(linkedList1);

        linkedList1.addLast("last");
        System.out.println(linkedList1);

        linkedList1.addFirst("First");
        System.out.println(linkedList1);
    }
}
