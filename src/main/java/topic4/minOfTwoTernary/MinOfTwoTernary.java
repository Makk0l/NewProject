package topic4.minOfTwoTernary;

public class MinOfTwoTernary {
    public static void main(String[] args) {
        int min = 5;
        int max = 9;

        Integer minValue = min < max ? min : max;
        System.out.println(minValue);
    }
}
