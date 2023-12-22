package Interfaces.List.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        System.out.println(arrayList);

        // set
        arrayList.set(0, "single");

        //get
        System.out.println(arrayList.get(1));


        System.out.println(arrayList);

    }
}
