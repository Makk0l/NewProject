package topic4.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int five = 15;

        boolean threeWithoutRemainder = five % 3 == 0;
        boolean fiveWithoutRemainder = five % 5 == 0;

        if (threeWithoutRemainder && fiveWithoutRemainder) {
            System.out.println("FizzBuzz");
        } else if (threeWithoutRemainder) {
            System.out.println("Fizz");
        } else if (fiveWithoutRemainder) {
            System.out.println("Buzz");
        } else {
            System.out.println(five);
        }
    }
}
