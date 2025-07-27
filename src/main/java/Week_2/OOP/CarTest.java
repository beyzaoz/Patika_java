package Week_2.OOP;

public class CarTest {

    public static void main(String[] args) {
        Classes bmw = new Classes(); //created object (instance)

        Classes bmw2 = new Classes("Bmw" ,"325" );
        bmw.setBrand("BMW");
        bmw.setModel("320");
        bmw.setMaxspeed(300);
        bmw.setHorsePower(180);

        bmw.move();

        bmw.incrementGear(2);

        int gear = bmw.getGear();
        System.out.println(gear);



    }

}
