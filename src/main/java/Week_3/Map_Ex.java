package Week_3;

public class Map_Ex {
    String title;
    String author;

    public Map_Ex(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String
    toString() {
        return
                "title='" + title + '\'' +
                ", author='" + author + '\'';
    }
}
