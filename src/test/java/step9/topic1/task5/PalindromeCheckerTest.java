package step9.topic1.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    @Test
    void isPalindromeTest_true() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("tenet"));
    }

    @Test
    void isPalindromeTest_false() {
        Assertions.assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    void isPalindromeTest_isEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> PalindromeChecker.isPalindrome(""));
    }
    @Test
    void isPalindromeTest_isNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> PalindromeChecker.isPalindrome(null));
    }

    @Test
    void isPalindromeTest_space(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome("tenet tenet"));
    }
    @Test
    void isPalindromeTest_toUpperCase(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome("TenEt"));
    }
}
