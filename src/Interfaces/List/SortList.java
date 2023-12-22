package Interfaces.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(75);
        list.add(20);
        list.add(23);
        list.add(98);
        list.add(53);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
