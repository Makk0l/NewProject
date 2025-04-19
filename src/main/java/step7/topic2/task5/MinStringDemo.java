package step7.topic2.task5;

import java.util.*;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");
        String str = list.stream().min(Comparator.comparingInt(l -> l.length())).orElse("");
        System.out.println(str);
    }
}
