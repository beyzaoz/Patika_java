package Week_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Merhaba Dunya";
        System.out.printf(name);

        //STRING CLASS

        int name1 = name.length();
        System.out.println(name1);

        System.out.println(name.toLowerCase());

        String name3 = name.toUpperCase();
        System.out.println(name3);

        System.out.println(name.charAt(5));

        System.out.println("Merhaba,Patika".substring(8));

        String hi = "Merhaba, ";
        System.out.println(hi+ "Patika");
        String name4 = hi.concat("Patika");
        boolean isEqual = hi.equals(name);
        System.out.println(isEqual);


        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "java";
        String s4 = "Java";

        System.out.println("s1 esit mi s2 " + s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println("s1 esit mi s3 " + s1.equals(s3));





    }
}