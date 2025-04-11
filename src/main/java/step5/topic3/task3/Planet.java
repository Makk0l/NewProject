package step5.topic3.task3;

public enum Planet {
    EARTH(5.972e24, 6.371e6),
    MARS(6.39e23, 3.3895e6),
    JUPITER(1.898e27, 6.9911e7);

    private final double mass;
    private final double radius;
    private final double G = 6.67430e-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}
