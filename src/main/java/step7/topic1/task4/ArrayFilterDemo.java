package step7.topic1.task4;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {
    public static void main(String[] args) {
        Integer[] arrayNumber = {5, 12, 7, 20, 3};
        MyPredicate<Integer> myPredicate = (i -> i > 10);
        List l = ArrayFilterDemo.filterArray(arrayNumber, myPredicate);
        l.forEach(System.out::println);

    }
    private static  <T> List<T> filterArray(T[] array, MyPredicate<T> predicate){
        List<T> list = new ArrayList<>();
        for (T element : array){
            if (predicate.test(element)){
                list.add(element);
            }
        }
        return list;
    }
}
