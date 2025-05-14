package step9.topic1.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitSumCalculatorTest {
    @Test
    void sumDigits_test(){
        Assertions.assertEquals(6, DigitSumCalculator.sumDigits(123));
    }
    @Test
    void sumDigits_negativeNumber_test(){
        Assertions.assertEquals(6, DigitSumCalculator.sumDigits(-123));
    }
    @Test
    void sumDigits_singleNumber_test(){
        Assertions.assertEquals(3, DigitSumCalculator.sumDigits(3));
    }
    @Test
    void sumDigits_nullNumber_test(){
        Assertions.assertEquals(0, DigitSumCalculator.sumDigits(0));
    }
}
