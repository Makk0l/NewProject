package step5.topic2.task1;

public class DivisionDemo {
    public static void main(String[] args) {
        int fistNumber = 5;
        int secondNumber = 0;
        int result;
        try {
            result = fistNumber / secondNumber;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }
    }
}
