package step4.topic3;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book( String title, String author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return title.concat(" ").concat(author).concat(" " + year);
    }
}
