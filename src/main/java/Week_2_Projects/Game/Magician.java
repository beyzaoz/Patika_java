package Week_2_Projects.Game;

public class Magician  extends Character{

    public Magician (String name) {
        super(name, 1500, 200);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(name + "Arrows! Damage: " + attackPower);
    }

    public void castSpell(){
        System.out.println(name + "CastSpell Defends! ");
    }
}
