package topic4.ageCategory;

public class AgeCategory {
    public static void main(String[] args) {
        int age = 64;
        String a = "Возраст человека";

        if (age < 13){
            a = "Ребенок";
        } else if (age >= 13 && age <= 19) {
            a = "Подросток";
        } else if (age >= 20 && age <= 64) {
            a = "Взрослый";
        } else if (age >= 65) {
            a = "Пожилой";
        }
        System.out.println(a);
    }
}
