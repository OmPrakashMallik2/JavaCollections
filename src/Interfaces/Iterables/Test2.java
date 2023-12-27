package Interfaces.Iterables;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Chiru");
        list.add(true);
        list.add("Ragnar");
        list.add(10);
        list.add("Bjon");
        System.out.println(list);

        ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Object obj = listIterator.next();
            System.out.print(obj+" ");
            if(obj.equals("Shyam")){
                listIterator.remove();
            } else if (obj.equals(true)) {
                listIterator.set(false);
            } else if (obj.equals(10)){
                listIterator.add("opm");
            }
        }
        System.out.println();

        System.out.println(list);
    }
}
