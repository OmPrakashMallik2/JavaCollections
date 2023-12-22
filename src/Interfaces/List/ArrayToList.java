package Interfaces.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr);

        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        System.out.println(list);

    }
}
