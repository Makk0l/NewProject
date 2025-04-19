package step7.topic1.task1;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.operate(5, 5);
        System.out.println(result);
    }
}
