package Week_2;

public class String_Pool {
    public static void main(String[] args) {
        var hello ="hello patika";
        var hello2 = "hello patika";
        System.out.println(hello.equals(hello2)); //dEGERLERIN ESITLIGI
        System.out.println(hello==hello2); //HAFIZADAKI YERLERI ESITMI DIYE

        String s = "Hello World";
        String s1 = " Hello World";
        System.out.println(s == s1);

        var stringname = "hello world";
        var concat = "hello";
        concat += " world";

        System.out.println(stringname == concat);
        System.out.println(stringname.equals(concat));

        var hello1 = "Hello World";
        var hello3 = new String("Hello World").intern();

        System.out.println(hello == hello3);
        System.out.println(hello.equals(hello3));






}}
