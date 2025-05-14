package step9.topic1.task2;

public class MaxFinder {
    public static int findMax(int[] numbers) {
        if (numbers == null|| numbers.length == 0){
            throw new ArrayIndexOutOfBoundsException("Массив пуст");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
