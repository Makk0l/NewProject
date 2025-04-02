package step2.topic6.arrayAverage;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int value = 0;

        for (int element : array){
            value += element;
        }
        value = (value / array.length);
        System.out.println(value);
    }
}
