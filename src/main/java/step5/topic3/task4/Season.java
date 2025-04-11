package step5.topic3.task4;

public enum Season {
    WINTER( - 7),
    SPRING(10),
    SUMMER(20),
    FALL(7);

    private final double middle;

    Season(double middle) {
        this.middle = middle;
    }

    @Override
    public String toString() {
        return "Season: " + name() + " Avg Temp: " + middle;
    }
}
