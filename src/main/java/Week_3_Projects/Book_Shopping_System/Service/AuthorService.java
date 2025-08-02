package Week_3_Projects.Book_Shopping_System.Service;

import Week_3_Projects.Book_Shopping_System.Author;
import Week_3_Projects.Book_Shopping_System.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AuthorService {

    private static Map<String,Author> allAuthors = new HashMap();


    public void create(String name,String surname, Gender gender){

        Author author = new Author(name,surname,gender);
        allAuthors.put(author.getName(),author);
    }

    public Author findAuthor(String name){
        return allAuthors.get(name);
    }
}
