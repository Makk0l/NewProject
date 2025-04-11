package step6.topic1.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(20);
        list.remove(Integer.valueOf(20));
        for (Integer value: list){
            System.out.println(value);
        }

    }

}
