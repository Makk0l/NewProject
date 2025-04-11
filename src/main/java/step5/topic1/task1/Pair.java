package step5.topic1.task1;

public class Pair<T, U> {
    private T fist;
    private U second;

    public Pair(T fist, U second) {
        this.fist = fist;
        this.second = second;
    }

    public T getFist() {
        return fist;
    }

    public void setFist(T fist) {
        this.fist = fist;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return fist + " " + second;
    }
}
