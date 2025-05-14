package step9.topic1.task4;

public class WordCounter {
    public static int countWords(String text) {
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException("Строка не должна быть пуста");
        }
        return text.split(" ").length;
    }
}
