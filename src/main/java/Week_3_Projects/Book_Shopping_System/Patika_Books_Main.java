package Week_3_Projects.Book_Shopping_System;

import Week_3_Projects.Book_Shopping_System.Service.AuthorService;
import Week_3_Projects.Book_Shopping_System.Service.ProductService;
import Week_3_Projects.Book_Shopping_System.Service.UserService;

import java.time.LocalDate;

public class Patika_Books_Main {
    public static void main(String[] args) {
        UserService userservice =  new UserService();//obje olusturuldu

        //degerler atandi
        userservice.create("Cem","abcde@gmail.com","1234cem");
        userservice.create("Ayse","12ayse@gmail.com","345ayse");
        userservice.create("Cemal","cemal@gmail.com","12cemal67");
        userservice.create("Fatos","fatosali@gmail.com","Fatos678");

        userservice.list(); //userservice de ki list methodunu cagirir

        AuthorService authorService = new AuthorService();
        authorService.create("Patika","Patika",Gender.WOMAN);
        Author author= authorService.findAuthor("Patika");

        ProductService productService = new ProductService();
        productService.create("Java Develope" , 155,author, LocalDate.of(2022,01,9));
        productService.create("Python Develope" , 130,author, LocalDate.of(2023,01,9));
        productService.create("C++ Develope" , 140,author, LocalDate.of(2024,01,9));
        productService.list();





    }
}
