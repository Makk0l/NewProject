package step2.topic8.minMaxFinder;

import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 2, 9};
        int[] arrayMinMax = findMinMax(array);

        for (int a : arrayMinMax) {
            System.out.println(a);
        }
    }

    public static int[] findMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int element : numbers) {
            if (element >= max) {
                max = element;
            } else if (element <= min) {
                min = element;
            }
        }
        int[] newArray = {numbers[0] = min, numbers[1] = max};
        return newArray;
    }
}
