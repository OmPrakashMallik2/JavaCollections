package Interfaces.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Om Prakash Mallik");
        linkedList.add("Jay Prakash Mallik");
        linkedList.add("Sachin Kr. Mallik");
        linkedList.add("Other names");

        // iteration
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}