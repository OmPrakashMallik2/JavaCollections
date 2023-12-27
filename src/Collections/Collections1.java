package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("six");
        System.out.println(arrayList);

        Collections.addAll(arrayList, "seven", "eight", "nine", "ten");
        System.out.println(arrayList);

        String[] arr = {"abc", "xyz"};
        Collections.addAll(arrayList,arr);
        System.out.println(arrayList);


        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
    }
}
