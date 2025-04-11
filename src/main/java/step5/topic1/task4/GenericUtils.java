package step5.topic1.task4;

public class GenericUtils {

    public static <T extends Comparable<T>> T max(T a, T b){
        return (a.compareTo(b) >= 0 ? a : b);
    }
}
