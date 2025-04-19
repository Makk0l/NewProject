package step7.topic1.task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] array = {"Java", "Lambda", "Stream", "API"};
        Arrays.sort(array, (s1,s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(Arrays.toString(array));

    }
}
