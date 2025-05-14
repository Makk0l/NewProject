package step9.topic1.task1;

public class DivisionCalculator {
    public static double divide(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }
}
