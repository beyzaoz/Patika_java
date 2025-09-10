package Week_7.ThreadPracticeMemoryGame;

import java.util.*;

public class MemoryGame {
    private  final Scanner scanner = new Scanner(System.in);
    private final Player player;
    private List<Level> levels = List.of(new Level("Easy",3,1500),
            new Level("Medium",5,1000),
            new Level("Hard",7,7000));;
    private final Set<Player> players = new HashSet<>();

    public MemoryGame(Player player, List<Level> levels) {
        this.player = player;
        this.levels = levels;

    }

    public MemoryGame(Player player) {
        this.player = player;
    }

    public void showMenu(){
        while(true){
            System.out.println("Oyun Menusu:");
            System.out.println("1-Oyunu Baslat");
            System.out.println("2-Liderlik Tablosu");
            System.out.println("3-Cikis");
            String choise = scanner.nextLine();

            switch(choise){

                case "1" :playGame();
                break;

                case "2" :showLeaderBoard();
                break;

                case "3" :
                    System.out.println("Bye! ");
                    return;
                default:
                    System.out.println("Try Again! ");
                }

            }
        }
        private void playGame(){
            System.out.println("Zorluk seviyesi sec: ");
            for(int i=0 ; i< levels.size();i++){
                System.out.println((i+1) + "-" + levels.get(i));
            }

            System.out.println("Secimiz: ");
            int levelIndex;
            levelIndex = Integer.parseInt(scanner.nextLine()) -1 ;

            levels.get(levelIndex);
            Level level = levels.get(levelIndex);

            List<Integer> numbers = new ArrayList<>();

            Random random = new Random();
            for (int i = 0; i<level.getNumberCount(); i++){
                int randomNumber = random.nextInt(90)+10;
                numbers.add(randomNumber);
            }
            System.out.println("🤯 Number are showing. Get Ready! ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            Thread showNumbrTask = new Thread(new NumberDisplayTask(numbers,level.getDisplayTime()));
            showNumbrTask.start();


        }

        private void showLeaderBoard(){
        //ilk 10 oyuncu

        }

    }

