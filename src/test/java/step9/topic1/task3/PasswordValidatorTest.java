package step9.topic1.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testIsValid(){
        Assertions.assertTrue(PasswordValidator.isValid("asdfl;jljfasd343"));
    }
    @Test
    void testIsValid_emptyValue(){
        Assertions.assertFalse(PasswordValidator.isValid(""));
    }
    @Test
    void testIsValid_spaceValue(){
        Assertions.assertFalse(PasswordValidator.isValid(" "));
    }
    @Test
    void testIsValid_shortValue(){
        Assertions.assertFalse(PasswordValidator.isValid("Short"));
    }
    @Test
    void testIsValid_notNumber(){
        Assertions.assertFalse(PasswordValidator.isValid("qwertyui"));
    }
}
