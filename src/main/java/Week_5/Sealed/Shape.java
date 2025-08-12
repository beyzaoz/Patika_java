package Week_5.Sealed;

//Kısaca, hangi sınıfların veya interfacelerin bir sınıftan miras alabileceğini sınırlamak için kullanılıyor.

/**
 * Normalde bir class veya interface public veya default erişim ile tanımlanırsa, onu istediğin sınıfta extend edebilirsin.
 *
 * sealed ile diyorsun ki:
 *
 * “Bu sınıfı sadece şu şu sınıflar miras alabilir, başkası alamaz.”
 *
 *
 * Kurallar:
 *
 * sealed sınıflar permits ile hangi sınıfların miras alabileceğini açıkça belirtir.
 *
 * Permits listesindeki sınıflar aynı dosyada veya aynı pakette olmalı.
 *
 * Permits listesindeki her sınıf şu üç tipten biri olmalı:
 *
 * final → Daha fazla miras verilemez.
 *
 * sealed → Kendi alt sınıflarını yine kısıtlayabilir.
 *
 * non-sealed → Kısıtlamaları kaldırır (o sınıftan herkes miras alabilir).
 * **/

public class Shape {
}
