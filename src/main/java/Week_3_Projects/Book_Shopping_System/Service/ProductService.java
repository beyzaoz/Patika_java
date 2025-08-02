package Week_3_Projects.Book_Shopping_System.Service;

import Week_3_Projects.Book_Shopping_System.Author;
import Week_3_Projects.Book_Shopping_System.Book;
import Week_3_Projects.Book_Shopping_System.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static List<Product> productList = new ArrayList<>();
    //Productla ilgili butun islemler burda
    public void create(String name, double price, Author author, LocalDate publishedDate){

        Product product1 = new Book(name , price,author,publishedDate);


        productList.add(product1);


    }

    public void list(){
        for(Product p : productList){
            System.out.println(p);
        }
    }
}
