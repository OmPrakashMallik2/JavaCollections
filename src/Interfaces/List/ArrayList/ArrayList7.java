package Interfaces.List.ArrayList;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");

        System.out.println(arrayList1);

        arrayList1.add(0, "X");
        arrayList1.add(1, "Y");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
        arrayList2.add("4");
        System.out.println(arrayList2);

//        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList1.addAll(2, arrayList2);
//        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }
}
