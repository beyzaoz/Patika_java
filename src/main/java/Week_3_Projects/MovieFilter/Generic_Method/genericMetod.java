package Week_3_Projects.MovieFilter.Generic_Method;

public class genericMetod {

    public static void main(String[] args) {
        //Integer array
        Integer[] num = {1,2,3,4,5,6,7};
        printArr(num);

        //String array
        String[] textvalue = {"Ankara","Izmir", "Istanbul","Mersin", "Alanya"};
        printArr(textvalue);

        //double array
        Double doubnum[] = {1.2,3.4,1.9,2.3,5.7};
        printArr(doubnum);

    }

    public static <T> void printArr(T[] array) {
        StringBuilder ints = new StringBuilder();
        StringBuilder strings = new StringBuilder();
        StringBuilder doubnum = new StringBuilder();

        for(T elements : array){

            if(elements instanceof Integer){
                ints.append(elements).append(" ");

            }
           else if(elements instanceof  String){
               strings.append(elements).append(" ");

            } else {

                doubnum.append(elements).append(" ");
            }
        }

        if(ints.length()>0){
            System.out.println(ints);
        }
        if(strings.length()>0){
            System.out.println(strings);
        }
        if(doubnum.length()>0){
            System.out.println(doubnum);
        }



        }


    }



