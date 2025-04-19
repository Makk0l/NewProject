package step7.topic2.task6;

import java.util.Arrays;
import java.util.List;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        List<Integer>newList = list.stream().distinct().toList();
        newList.forEach(System.out::println);
    }
}
