package Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(73);
        arrayList.add(52);
        arrayList.add(28);
        arrayList.add(14);
        arrayList.add(93);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
