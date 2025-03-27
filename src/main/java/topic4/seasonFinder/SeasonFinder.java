package topic4.seasonFinder;

public class SeasonFinder {
    public static void main(String[] args) {
        int month = 1;

        String season = switch (month){
            case 1 -> "Зима";
            case 2 -> "Зима";
            case 3 -> "Весна";
            case 4 -> "Весна";
            case 5 -> "Весна";
            case 6 -> "Лето";
            case 7 -> "Лето";
            case 8 -> "Лето";
            case 9 -> "Осень";
            case 10 -> "Осень";
            case 11 -> "Осень";
            case 12 -> "Зима";
            default -> "Неверный месяц";
        };
        System.out.println(season);
    }
}
