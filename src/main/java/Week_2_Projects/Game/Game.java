package Week_2_Projects.Game;

import java.util.Scanner;

public class Game {


    /**
     * Warrier
     * Magician
     * arrow
     * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many attack?");
        int attackNum = scanner.nextInt();


        Warrior warr = new Warrior("Michael");
        Magician mag = new Magician("Gandalph");
        arrow arro = new arrow("Ed");


        arro.showStats();
        warr.showStats();
        mag.showStats();

        //Characters Attackin

        System.out.println("Attacks are begining.");


        /** warr.attack();
        warr.levelup();
        arro.attack();
        arro.levelup();
        mag.attack();
        mag.levelup(); */

        for(int i=0; i<=attackNum; i++){
            warr.levelup();
            arro.attack();
            arro.levelup();
            mag.attack();
            mag.levelup();
        }

        System.out.println("Special features");

        warr.shieldBlock();
        mag.castSpell();
        arro.MultiArrow();








    }
}
