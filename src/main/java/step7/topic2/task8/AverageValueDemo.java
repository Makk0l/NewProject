package step7.topic2.task8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        OptionalDouble o = list.stream().mapToInt(value -> value).average();
        o.stream().forEach(System.out::println);
    }
}
