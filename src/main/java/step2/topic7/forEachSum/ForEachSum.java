package step2.topic7.forEachSum;

public class ForEachSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        int value = 0;
        for (int a : array){
            value += a;
        }
        System.out.println(value);
    }
}
