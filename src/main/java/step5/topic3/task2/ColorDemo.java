package step5.topic3.task2;

public class ColorDemo {
    public static void main(String[] args) {
        for (Color color : Color.values()){
            System.out.println(color + " " + color.getHastag());
        }
    }
}
