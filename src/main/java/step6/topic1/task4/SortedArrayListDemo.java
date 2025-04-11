package step6.topic1.task4;

import java.util.*;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(6);
        list.add(17);
        list.add(8);
        Collections.sort(list);
        for (Integer value : list){
            System.out.println(value);
        }
    }
}
