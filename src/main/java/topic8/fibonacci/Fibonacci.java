package topic8.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(5));
    }
    public static int fibonacci(int n){
        int numberOne = 1;
        int numberTwo = 1;
        int result = 0;

        for (int i = 2; i < n; i++){

            result = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = result;
        }
        return result;
    }
}
