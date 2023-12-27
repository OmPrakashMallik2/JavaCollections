package Collections.Sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Sorting2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(75);
        linkedList.add(20);
        linkedList.add(23);
        linkedList.add(98);
        linkedList.add(53);
        System.out.println(linkedList);

        linkedList.sort(Collections.reverseOrder());
        System.out.println(linkedList);
    }
}
