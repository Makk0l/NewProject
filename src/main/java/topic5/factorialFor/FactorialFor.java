package topic5.factorialFor;

public class FactorialFor {
    public static void main(String[] args) {
        int n = 15;
        long fact = 1;

        for (int i = 1; i <= n; i++){
                fact *= i;
        }
        System.out.println(fact);
    }
}
