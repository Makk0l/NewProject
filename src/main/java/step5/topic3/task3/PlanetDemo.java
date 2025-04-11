package step5.topic3.task3;

public class PlanetDemo {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()){
            System.out.println(planet + " " + planet.surfaceGravity());
        }
    }
}
