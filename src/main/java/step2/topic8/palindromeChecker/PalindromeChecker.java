package step2.topic8.palindromeChecker;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "кок";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String text){

        text = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = text.length() - 1;

        while (left < right){
            if (text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
