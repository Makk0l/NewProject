package step9.topic1.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {
    @Test
    void testNonLeapYear_returnsFalse(){
        Assertions.assertFalse(LeapYearChecker.isLeapYear(2025));
    }
    @Test
    void testYearDivisibleBy100ButNot400_returnsFalse(){
        Assertions.assertFalse(LeapYearChecker.isLeapYear(100));
    }
    @Test
    void testYearDivisibleBy400_returnsTrue(){
        Assertions.assertTrue(LeapYearChecker.isLeapYear(400));
    }
    @Test
    void testYearDivisibleBy4_returnsTrue(){
        Assertions.assertTrue(LeapYearChecker.isLeapYear(2024));
    }
}
