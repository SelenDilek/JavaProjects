package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        //diziler(array ler icin Array methodlari var
        //ArrayList ler icin Collection methodlari ()
        //eleman sayin belli ise dizi degilse array. Dizileri duzenlemek veya islem yapmak icin collections.

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //siralama islemi icin
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //tersine cevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //butun elemanlari tek bir degere set etmek icin kullanilir.
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        //replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar = " + sayilar);

        //tanimlarken deger atma
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,4,56,78,89));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ahmet" , "mhmet" , "ayse"));

        System.out.println("liste = " + liste);
        System.out.println("strList = " + strList);

        //AddAll : bir veya fazla degerleri listeye ekler
        Collections.addAll(sayilar,56,67,89,87);
        System.out.println("sayilar = " + sayilar);

        //bir diziyi nasil ArrayListe atarim.

        Integer[] dizi2 = {2,3,45,56};
        ArrayList<Integer> liste3 = new ArrayList<>(Arrays.asList(dizi2)); //int olarak diziye atamazsin Integer olmak zorunda.!
        System.out.println("liste3 = " + liste3);











                

    }
}
