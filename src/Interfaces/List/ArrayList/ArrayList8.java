package Interfaces.List.ArrayList;

import java.util.ArrayList;

public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");

        System.out.println(arrayList1);
//        arrayList1.remove(1);
//        arrayList1.remove("B");
//        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("X");
        arrayList2.add("Y");
        arrayList2.add("C");
        arrayList2.add("D");
        System.out.println(arrayList2);

//        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

//        arrayList1.clear();
//        System.out.println(arrayList1);

//        System.out.println(arrayList1.isEmpty());
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
