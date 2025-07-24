package Week_2;

public class String_Methods {
    public static void main(String[] args) {
        var s ="Lavender";

        String Flower = "Daisy"; // 7 character
         int length = Flower.length();
        System.out.println(Flower +"-->"+ length);

        char firstin = Flower.charAt(4 );
        System.out.println(firstin);

        System.out.println(Flower.indexOf("s"));

        System.out.println(Flower.indexOf("a",2));

        System.out.println(Flower.substring(3));
        System.out.println(Flower.substring(1,3));
        boolean check = Flower.equals("Lavender "); //Boolean
        System.out.println(check);
        System.out.println(Flower.startsWith("Da"));
        System.out.println(Flower.endsWith("sy"));

        System.out.println(Flower.contains("s"));
        System.out.println(Flower.replace("s", "b"));


    }
}
