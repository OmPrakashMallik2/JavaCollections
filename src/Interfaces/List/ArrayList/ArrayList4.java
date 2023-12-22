package Interfaces.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
    public static void main(String[] args) {
        // sorting the arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(3);

        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
