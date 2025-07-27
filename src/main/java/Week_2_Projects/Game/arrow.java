package Week_2_Projects.Game;

public class arrow extends Character {

    public arrow (String name) {
        super(name, 1500, 250);
    }
    @Override
    public void attack() {
        super.attack();{
            System.out.println(name + "attacked with arrow! Damaged: " + attackPower );
        }
    }
    public void MultiArrow(){
        System.out.println( name + " defends with  multi arrows.");
    }

}
