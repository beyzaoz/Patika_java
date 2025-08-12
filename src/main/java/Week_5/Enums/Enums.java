package Week_5.Enums;

public enum Enums {
    DUSUK(1), ORTA(2), YUKSEK(3);

    private final int kod;

    Enums(int kod) {
        this.kod = kod;
    }

    public int getKod() {
        return kod;
    }
}

/**
 * Özet Kurallar:
 * Enum sabitleri ilk satırda tanımlanır.
 *
 * Constructor private olmalı (Java bunu otomatik yapar).
 *
 * Enum değerleri public static final’dır.
 *
 * Enum başka bir sınıftan extend edemez (Java zaten enum’a java.lang.Enum’dan miras verir).
 *
 * Enum içinde field, metod, constructor tanımlanabilir.
 *
 * Enum’lar switch-case ile kullanılabilir.
 *
 * Enum sabitleri immutable’dır.
 * **/


