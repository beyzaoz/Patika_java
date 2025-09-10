package Week_8.practice2;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LogApp {
    private static Set<String> USER_NAMES = new HashSet<>();
    private static File LOG_FILE = new File("D:\\JAVA Project\\Patika_java\\src\\main\\resources\\log.txt");
    public static void main(String[] args) {
        USER_NAMES.add("Aby");
        USER_NAMES.add("Tom");
        USER_NAMES.add("Lisa");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your UserName: ");
        String userName = scanner.nextLine();

        final Optional<String> optionalUserName = USER_NAMES.stream().filter(name -> name.equalsIgnoreCase(userName))
                .findFirst();

        if(optionalUserName.isEmpty()){
            //log
            System.out.println("Username not founded: " + userName);
            writeLog(LogLevel.ERROR, "Username not founded! ");
        }else{
           writeLog(LogLevel.INFO, "User found" + userName);
        }

        int choise;
        do{
            System.out.println("\n -----LOG UYGULAMASI-----");
            System.out.println("1-Search");
            System.out.println("2-Clean");
            System.out.println("3-Exit");

            System.out.println("Your choice: ");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise){
                case 1:
                    searchLog(scanner);
                    break;

                case 2:
                    clearLogFile(scanner);
                    break;

                case 3:
                    writeLog(LogLevel.INFO, "Exited");
            }


        }while( choise!= 3);

        scanner.close();


    }

    private static void clearLogFile(Scanner scanner) {

        System.out.println("Are you sure? (Y/N)");

        String choise = scanner.nextLine().toLowerCase();
        if("e".equalsIgnoreCase(choise)){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE))){
                writer.write("");
                System.out.println("Cleaned! ");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Canceled");
        }

    }

    private static void searchLog(Scanner scanner) {
        System.out.println("Username: ");
        String searchKey = scanner.nextLine();

        boolean isFound = false;

        try(BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))){
            String line;
            while((line = reader.readLine()) != null){
                if(line.toUpperCase().contains(searchKey.toUpperCase()));{
                System.out.println("Found log: " + line);
                isFound = true;

                }
            }

            if(!isFound){
                System.out.println("Log not founded");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeLog(LogLevel logLevel, String message) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))){

           String formattedDate =  LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
           String log = String.format("[%s] [%s] [%s}", formattedDate,logLevel,message);

           writer.write(log);

           writer.newLine();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
