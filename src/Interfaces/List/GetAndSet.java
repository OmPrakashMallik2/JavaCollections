package Interfaces.List;

import java.util.ArrayList;
import java.util.List;

public class GetAndSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("OPM");
        list.add("JPM");
        list.add("SKM");
        list.add("Other");
        System.out.println(list);

        list.set(3, "New");
        System.out.println(list);
    }
}
