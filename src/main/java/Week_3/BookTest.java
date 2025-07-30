package Week_3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookTest {
    public static void main(String[] args) {
        Set<Book_Set> books = new HashSet<>();
        Book_Set book1 = new Book_Set("Clean Code", "Robert C. Martin");
        Book_Set book2 = new Book_Set("Effective Java", "Jashua Bloch");
        Book_Set book3 = new Book_Set("Clean Code", "Robert C. Martin");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println(books.size()+" Books we have");
        System.out.println("My library:"+ books);


        System.out.println("--------TreeSet--------");

        Set<Book_Set> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);

        System.out.println("my Library: " + bookTreeSet);







    }
}
