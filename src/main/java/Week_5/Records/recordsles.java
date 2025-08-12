package Week_5.Records;

public class recordsles {

    /**
     * record otomatik final’dır → extend edilemez.
     *
     * Alanlar final’dır → değiştirilemez.
     *
     * record başka bir sınıfı extend edemez, ama interface implement edebilir.
     *
     * record constructor’ları overload edebilirsin.
     *
     * İçinde static field/metot tanımlayabilirsin.
     *
     *
     * Kısa, temiz, az kod.
     *
     * Immutable veri taşıyıcıları için ideal.
     *
     * equals() ve hashCode() otomatik, hata riski düşük.
     *
     * Constructor, getter, toString(), equals() ve hashCode() otomatik gelir.
     *
     * **/

    public static void main(String[] args) {
        System.out.println("Bird Records!");

        var mommy = new Bird(4,"Mavis");
        System.out.println(mommy.numberEgg());
        System.out.println(mommy.name());

        var child = new Bird(0,"Sari");


    }
}
