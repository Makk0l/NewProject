package step5.topic1.task2;

public class ArrayUtils<T> {

    public static <T> void swap(T[] array, int i, int j) {
        if (array == null || i < 0 || j < 0 || i >= array.length){
            throw new IllegalArgumentException("Неверный ввод");
        }
        T arrayNumber = array[i];
        array[i] = array[j];
        array[j] = arrayNumber;
    }
}
