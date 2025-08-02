package Week_3_Projects.Book_Shopping_System;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book extends Product{

    private Author author;
    private LocalDate publishdate;
    private LocalDateTime createdDate;

    public Book(String name, double price,Author author,LocalDate publishdate) {
        super(name, price);
        this.author=author;
        this.publishdate=publishdate;
        this.createdDate=LocalDateTime.now();


    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
        "name =" + getName() +
        "price=" + getPrice() +
                ", publishdate=" + publishdate +
                ", createdDate=" + createdDate +
                '}';
    }
}
