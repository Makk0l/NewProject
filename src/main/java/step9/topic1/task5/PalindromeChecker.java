package step9.topic1.task5;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException("Текст не может быть пустым");
        }
        String newText = text.toLowerCase();
        String reversed = new StringBuilder(newText).reverse().toString();
        return newText.equals(reversed);
    }
}
