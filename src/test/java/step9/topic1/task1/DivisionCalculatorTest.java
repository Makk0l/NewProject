package step9.topic1.task1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisionCalculatorTest {
    @Test
    void divide() {
        Assertions.assertEquals(3,DivisionCalculator.divide(6,2));
    }
    @Test
    void divideByZero(){
        Assertions.assertThrows(ArithmeticException.class,()-> DivisionCalculator.divide(6,0));
    }
}
