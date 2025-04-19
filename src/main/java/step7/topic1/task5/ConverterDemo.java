package step7.topic1.task5;

public class ConverterDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Converter converter = i -> i * i;
        int[] arraySort = convertArray(array, converter);
        for (int a : arraySort){
            System.out.println(a);
        }
    }

    public static int[] convertArray(int[] array, Converter converter) {
        int[] arrayPow = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrayPow[i] = converter.convert(array[i]);
        }

        return arrayPow;
    }
}
