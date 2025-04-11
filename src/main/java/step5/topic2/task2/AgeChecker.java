package step5.topic2.task2;

public class AgeChecker {
    public static void main(String[] args) {
        AgeChecker ageChecker = new AgeChecker();
        try {
            ageChecker.checkAge(150);
        }catch (InvalidAgeException e){
            e.printStackTrace();
        }

    }

    public void checkAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 150) {
            throw new InvalidAgeException("Неверный возраст");
        }
    }
}
