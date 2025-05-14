package step9.topic1.task3;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password == null || password.isEmpty()){
            return false;
        }
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}
