package step7.topic2.task4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        List<Integer> array = Arrays.asList(10, 15, 20, 25, 30, 35);
        array.stream().filter(number -> number % 2 == 0)
                .forEach(n -> {
                    System.out.println(i.getAndIncrement() + " " + n);
                });
    }
}
