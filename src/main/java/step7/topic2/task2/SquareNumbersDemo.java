package step7.topic2.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list = array.stream().map(a -> a * a).toList();
        list.forEach(System.out::println);
    }

}
