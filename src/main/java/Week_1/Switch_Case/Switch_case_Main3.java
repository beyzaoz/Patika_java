package Week_1.Switch_Case;

public class Switch_case_Main3 {
    public static void main(String[] args) {
        int grade= 85;
        //Java 14 ile gelen switchin farkli kullanimi:

        String lettergrade = switch(grade /10){
            case 10,9-> "A";
            case 8 -> "B";
            case 6 -> "C";
            case 4,5 -> "D";
            default-> "F";


        };

    }
}
