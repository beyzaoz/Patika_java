package Week_2_Projects.Game;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name, 1500, 300);
    }

    @Override
    public void attack() {
        super.attack();{
            System.out.println(name + "attacked with sword! Damaged: " + attackPower );
        }
    }
    public void shieldBlock(){
        System.out.println( name + " defends with shield.");
    }

}
