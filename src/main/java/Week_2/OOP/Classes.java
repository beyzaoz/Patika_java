package Week_2.OOP;

public class Classes implements Interf_Lesson {

    //Car Fields
    private String brand;

    private String model;

    private int Maxspeed;

    private int HorsePower;

    private int maxGearCount = 6;
    private int gear = 0;
    public Classes(){}

    public Classes(String bmw2, String number) {
        this.brand = brand;
        this.model = model;
    }

    public void move(){
        System.out.println("Move Forward");

    }

    public void incrementGear(int gearCount){
        if(gearCount<=maxGearCount){
            this.gear = gearCount;
            System.out.println("Gear increase: "+ gear);
        }else{
            System.out.println("You enter wrong number. ");
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxspeed(int maxspeed) {
        Maxspeed = maxspeed;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMaxspeed() {
        return Maxspeed;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void start() {

    }
}
