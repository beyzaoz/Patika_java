package Week_5.Lambdas;



public class Lamb {

    public static void main(String[] args) {
        Greetings greetings = new Greetings() {
            @Override
            public void method(String string) {
                System.out.println("Hello"+ string);
            }
        };
        greetings.method("Cem");

        //Lamabda ile ne degisti:
        // (parametre) -> {Methodgovdesi}
        //eger tek parametre varsa parantessiz kullanilabilir:  parametre -> {method govdesi}
        Greetings greetings1 = (name)->System.out.println("Hello"+ name); // Bu lambda kullanimi
    }
}
