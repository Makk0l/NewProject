package topic2.swapValues;

public class SwapValues {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int test;
        System.out.println(one);
        System.out.println(two);
        System.out.println();

        test = one;
        one = two;
        two = test;
        System.out.println(one);
        System.out.println(two);
    }
}
