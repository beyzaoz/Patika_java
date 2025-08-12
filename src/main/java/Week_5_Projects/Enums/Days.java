package Week_5_Projects.Enums;

public enum Days
{
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
    ;

    private int day;



    private Days(int day){
       this.day = day;
    }

    public int getday(){
        return day;
    }

    public static Days fromnumber(int day){
        for(Days days :Days.values()){
            if(days.getday() == day){
                return days;

            }
        }
         throw new IllegalArgumentException("Wrong!");
    }
}
