package step7.topic2.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("apple", "ant", "banana", "berry", "cherry", "carrot");
        Map<Character, List<String>> list = array.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0)));
        list.forEach((a, b) ->System.out.println(a + " " + b));
    }
}
