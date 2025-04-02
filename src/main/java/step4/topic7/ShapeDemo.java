package step4.topic7;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("Площадь круга " + circle.getArea());
        System.out.println("Периметр круга" + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("Площадь прямоугольника " + rectangle.getArea());
        System.out.println("Периметр прямоугольника " + rectangle.getPerimeter());
    }
}
