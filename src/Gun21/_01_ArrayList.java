package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        /*
int[] dizi=new int[50];
uzunluk sabit.değiştirilemiyor.

int sayi; integer tipinde bir değişken

sayın java, bana öyle bir dizi tipi ver ki
ben ekledikçe boyu uzasın.sildikçe kısalsın

java derki : güzel olur tamam vericem.
Fakat şunu bil, kaç eleman olduğu belli ise
şu ana kadar gösterdiğim dizi tipini kullan
çünkü bu hızlı çalışıyor,
senin istediğin DİNAMİK dizi olduğundan
bundan yavaş çalışacaktır

liste : eklersin silersin, boyu ona göre değişir.
         */
        //dizi uzalip kisalmaz , liste dinamiktir ve ekleyip cikartma yapabiliriz.

        //dizi,array : boyut sayisi belli , sonradan degistirilemez.
        int [] dizi = new int[5]; // 5 elemanli Array,boyutu degistirilemez.

        //Boyutu dinamik olsun , eleman ekledikce uzasin,sildikce kisalsin.
        //ArrayList: boyutunu bastan vermen gerekmiyor. baslangicta boyutu 0
        //eleman ekledikce artar , sildikce kisalir.

        ArrayList<Integer> integerList = new ArrayList<>(); //boyut yok bi sey eklemiyoruz
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();


        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler); //bos

        isimler.add("Ahmet"); //uzunluk 1 oldu
        isimler.add("Metin"); //uzunluk 2 oldu
        isimler.add("Burak"); //uzunluk 3 oldu
        isimler.add("Selen"); //uzunluk 4 oldu

        System.out.println("isimler = " + isimler); //yazdirir
        System.out.println("isimler.size() = " + isimler.size()); //uzunlugu sabit degil method bu sayip getiriyor.Uzunluk verir.


        
        isimler.add(1,"Nur"); //indexe de direkt atayabiliriz. Verilen indexe atar. digerleri 1 kayiyor.
        System.out.println("isimler = " + isimler);
        
        isimler.set(1,"Elife"); //verilen indexdeki elemani degistirir.Update eder. replace gibi.
        System.out.println("isimler = " + isimler);
        
        boolean varMi= isimler.contains("Elife"); // icerir mi? true ,false
        System.out.println("varMi = " + varMi);

        isimler.remove("Ahmet"); //silme islemi yapar.
        System.out.println("isimler = " + isimler);

        isimler.remove(2); //Burak silinecek
        System.out.println("isimler = " + isimler);
        
        int indexOfMetin = isimler.indexOf("Metin"); //Metin'in indexi
        System.out.println("indexOfMetin = " + indexOfMetin);

        String ilkEleman = isimler.get(0); //0. elemani ver.

        isimler.clear();

        System.out.println("isimler = " + isimler);





    }
}
