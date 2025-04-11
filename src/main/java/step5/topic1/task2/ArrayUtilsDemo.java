package step5.topic1.task2;

import java.util.Arrays;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        ArrayUtils.swap(numbers, 2, 4);
        System.out.println(Arrays.toString(numbers));

    }
}
