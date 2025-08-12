package Week_3_Projects.bookEx;

public class Book {
    public String title;
    public String author;
    public int pagenumber;

    public Book(String title, String author, int pagenumber) {
        this.title = title;
        this.author = author;
        this.pagenumber = pagenumber;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagenumber=" + pagenumber;
    }
}
