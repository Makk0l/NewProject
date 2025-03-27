package topic4.dayOfWeek;

public class DayOfWeek {
    public static void main(String[] args) {
        int day = 8;

        String dayName = switch (day){
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный день недели";
        };
        System.out.println(dayName);
    }
}
