package Week_7.ThreadPracticeMemoryGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Memory Game! 🎮🕹️");
        System.out.println("Enter Your NickName: ");
        String nickName = scanner.next();

        MemoryGame memoryGame = new MemoryGame(new Player(nickName));
        memoryGame.showMenu();
    }
}
