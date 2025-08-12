package Week_3_Projects.bookEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        kitapBilgisiYazdir();


    }

    public static void kitapBilgisiYazdir() {
        List<Book> a = new ArrayList<>();
        a.add(new Book("Shadows of Eternity","Liam Carter",412));
        a.add(new Book("The Silent Voyage", "Emily Hart", 326));
        a.add(new Book("Crimson Dusk", "Noah Bennett", 289));
        a.add(new Book("Echoes in the Mist", "Sophia Reed", 378));

        for(Book books : a){
            System.out.println(books);
        }

    }
}
