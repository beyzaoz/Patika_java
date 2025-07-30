package Week_3;

import java.util.Objects;

public class Book_Set  implements  Comparable<Book_Set>{
    private String title;
    private String author;

    public Book_Set(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book_Set{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override //Tekrar engellendi
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book_Set bookSet = (Book_Set) o;
        return Objects.equals(title, bookSet.title) && Objects.equals(author, bookSet.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public int compareTo(Book_Set other) { //other bir sonraki karsilastiracagi obje demek.
        return this.title.compareTo(other.title);
    }
}
