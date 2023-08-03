package Gun30.StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
        //Problem ayni okulu defalarca yaziyoruz.
        //Bu veri hepsinde tekrar ediyorsa o veri class a aittir.
        //tekrarlananlar icin kullanilir.(static)

        //Ogrenci ogr1 = new Ogrenci("Selen", "Dilek", "Yildirim Ilkokulu");
       // Ogrenci ogr2 = new Ogrenci("Serkan", "Sengul", "Yildirim Ilkokulu");
       // Ogrenci ogr3 = new Ogrenci("Elif", "Ozen", "Yildirim Ilkokulu");

        //...
        //...

       // Ogrenci ogr499 = new Ogrenci("Senol", "Dogan", "Yildirim Ilkokulu");
       // Ogrenci ogr500 = new Ogrenci("Murat", "Savluk", "Yildirim Ilkokulu");

        Ogrenci ogr1 = new Ogrenci("Selen" , "Dilek");
        System.out.println("ogr1 = " + ogr1); //okul adi otomatik geldi

        Ogrenci.okulAd="Atatturk Ilkokulu";
        System.out.println("ogr1 tekrar= " + ogr1); //en son attigin deger gecerli oluyor.

        //Ayni verinin cok kez girisi engellendi.
        //Ayni verinin hafizada NESNE sayisi kadar tekrarlanmasi engellendi.
    }


}
