package step5.topic3.task2;

public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");
    public final String hastag;

    Color(String hashtag) {
        this.hastag = hashtag;
    }

    public String getHastag() {
        return hastag;
    }
}
