package Week_2.OOP.Abstract_Method;

public abstract class Abstract {
    //Dogrudan nesne olusturulmaz. Like Interface.

    public abstract void makeSound(); //Dogrudan bu classtan nesne olusturulamaz. Bir alt class gerekli.
    //Bu soyut bir method yani abstarct oldugu icin body yok yani implementation yok.(Bu islemin nasil yapilmasi gerektigi)

    public void sleep(){
        System.out.println("Sleeping.");

    }

}
