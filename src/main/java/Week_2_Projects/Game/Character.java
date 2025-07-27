package Week_2_Projects.Game;

public class Character {

    protected String name;
    protected  int health;
    protected int attackPower;
    protected int level;
    public int xp;

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }



    public void setLevel(int level) {
        this.level = level;
    }

    public void levelup(){
        switch(xp){
            case 120:
                level =2;
                health+= 100;
                attackPower += 200;
                System.out.println(level + ". level!" );
                System.out.println("Attack Power is: " + attackPower);
                System.out.println("Health is: " + health);
                break;
            case 240:
                level = 3;
                health+= 100;
                attackPower += 200;
                System.out.println(level + ". level!");
                System.out.println("Attack Power is: " + attackPower);
                System.out.println("Health is: " + health);
                break;
            case 360:
                level = 4;
                health+= 100;
                attackPower += 200;
                System.out.println(level + ". level!");
                System.out.println("Attack Power is: " + attackPower);
                System.out.println("Health is: " + health);
                break;
            case 480:
                level = 5;
                health+= 100;
                attackPower += 200;
                System.out.println(level + ". level!");
                System.out.println("Attack Power is: " + attackPower);
                System.out.println("Health is: " + health);
                break;
            case 600:
                level = 6;
                health+= 100;
                attackPower += 200;
                System.out.println("Last Level!");
                System.out.println("Attack Power is: " + attackPower);
                System.out.println("Health is: " + health);
                break;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level=level;
        this.xp = 0;
    }
    public void gainXP(int amount){
        xp+=amount;
        System.out.println(name + " Earned XP: " + amount + " | Total XP: " + xp);
        levelup();
    }

    public void attack(){
        System.out.println(name + " Attacked. Damage is " + attackPower);
        gainXP(attackPower/10);


    }

    public void showStats(){
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + attackPower);
        System.out.println("Level: " + level);
        System.out.println("XP: " + xp);

    }
}
