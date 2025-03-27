package topic8.averageCalculator;

public class AverageCalculator {
    public static void main(String[] args) {
        double[] array = {3.5, 6.3, 1.2, 4.5};
        double value = getAverage(array);
        System.out.println(value);
    }

    public static double getAverage(double[] numbers){
        double sum = 0;
        for (double a : numbers){
            sum += a;
            sum = sum / numbers.length;
        }
        return sum;
    }
}
