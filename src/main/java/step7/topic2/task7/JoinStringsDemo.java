package step7.topic2.task7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue", "yellow");
        String str = list.stream().collect(Collectors.joining(","));
        System.out.println(str);
    }
}
