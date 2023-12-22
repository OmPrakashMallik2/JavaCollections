package Interfaces.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(52);
        list.add(28);
        list.add(14);
        list.add(93);
        System.out.println(list);

        Integer[] arr = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
