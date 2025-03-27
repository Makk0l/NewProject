package topic4.gradeBonus;

public class GradeBonus {
    public static void main(String[] args) {
        int input = 4;
        int bonus;

        if (input == 5){
            bonus = 100;
        }
        else if (input == 4){
            bonus = 75;
        }
        else if (input == 3){
            bonus = 50;
        }else {
            bonus = 0;
        }
        System.out.println("Bonus " + bonus);
    }
}
