package Week_2.OOP.Inheritance_Method.Example1;

public class Book extends Product {

    private  String author;

    public Book (){
        super();
    }


    public Book(String name){
        super(name);
    }

    public Book(String name, double price){
        super(name, price);
    }

}
