package topic8.evenNumbersArray;

import java.util.Arrays;

public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] array = getEvenNumbers(8);
        System.out.println(Arrays.toString(array));
    }
    public static int[] getEvenNumbers(int n){
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++){
            arrays[i] = 2 * (i + 1);
        }
        return arrays;
    }
}
