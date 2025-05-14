package step9.topic1.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {
    @Test
    void countWordsTest(){
        Assertions.assertEquals(4, WordCounter.countWords("hi my name Tim"));
    }
    @Test
    void countWordsTest_isEmpty(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->WordCounter.countWords(""));
    }
    @Test
    void countWordsTest_isNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->WordCounter.countWords(null));
    }
    @Test
    void countWordsTest_twoChars(){
        Assertions.assertEquals(3, WordCounter.countWords("hi  my"));
    }
    @Test
    void countWordsTest_notNewLines(){
        Assertions.assertEquals(1, WordCounter.countWords("himynameTim"));
    }
    
}
