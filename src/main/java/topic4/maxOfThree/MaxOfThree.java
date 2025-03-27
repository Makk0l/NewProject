package topic4.maxOfThree;

public class MaxOfThree {
    public static void main(String[] args) {
        int oneNumber = 5;
        int secondNumber = 7;
        int thirdNumber = 3;

        boolean maxValue1 = oneNumber > secondNumber || oneNumber > thirdNumber ;
        boolean maxValue2 = secondNumber > oneNumber || secondNumber > thirdNumber;

        if (maxValue1){
            System.out.println(oneNumber);
        } else if (maxValue2) {
            System.out.println(secondNumber);
        }else {
            System.out.println(thirdNumber);
        }
    }
}
