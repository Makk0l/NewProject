package step9.topic1.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {

    @Test
    void testFindMax() {
        Assertions.assertEquals(7, MaxFinder.findMax(new int[]{3, 5, 7}));
    }

    @Test
    void testFindMax_singleElement() {
        Assertions.assertEquals(3, MaxFinder.findMax(new int[]{3}));
    }

    @Test
    void testFindMax_negativeNumbers() {
        Assertions.assertEquals(-3, MaxFinder.findMax(new int[]{-3, -5, -7}));
    }
    @Test
    void testFindMax_nullElements(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()-> MaxFinder.findMax(new int[]{}));
    }
}
