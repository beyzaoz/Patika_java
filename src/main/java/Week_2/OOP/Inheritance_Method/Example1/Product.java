package Week_2.OOP.Inheritance_Method.Example1;

public class Product extends Object //extend objects her zaman eklidir gorunmese bile.
 {
     private String name;

     private double price;
     public Product(){}

     public Product(String name){

         this.name = name;

     }


     public Product(String name, double price){
         this.name = name;
         this.price = price;


     }

     public void setPrice(double price) {
         this.price = price;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }

}
