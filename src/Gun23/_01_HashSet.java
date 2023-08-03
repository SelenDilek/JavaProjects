package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
       
        int sayi=5; //hafizada sadece 1 sayi sakliyor
        int [] dizi = new int[6] ; //Hafizada 6 sayi  sakliyor sabit boyutlu dinamik degil.
        ArrayList<Integer> liste = new ArrayList<>(); //boyu degisken , sinidr yok.
        
        //tekrar eden olmasin mesela id no , tc no gibi. Icinde tekrar eden deger yok.
        //oyle bir dizi tipi olsun ki icinde tekrar eden degerler olmasin. (TEKRAR EDEN DEGER YOK!)
        //her zaman sirali olsun, bazen eklendigi sirada sirali olsun, bazen de hizlli calis sira oenmsiz olsun.
        //bu is icin SET ler adini verdigimiz ozel diziler var.
        
        //**************************SET*******************************// (bi set ver)
        //HashSet -> sen ekledikce hizli calismak icin kendine gore bir sira tutuyor.TEKRAR YOK!
        //LinkedHashSet -> sen ekledikce eklenme sirasina gore tutuyor.TEKRAR YOK!
        //TreeSet -> sen ekledikce onlari her zaman sirali tutyor. TEKRAR YOK!
        //Bunlarin ortak ozelligi TEKRAR eden   YOK ve INDEX yok.

        //Unique tutacaksan
        HashSet<Integer> hs1 = new HashSet<>(); //index kavrami yok set e bakiyor!
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi = hs1.add(5); //tekrar eklendi. Acaba diziye kabul etti mi? -> ETMEDI
        hs1.add(2); //tekrar eklendi. Acaba diziye kabul etti mi? -> ETMEDI
        System.out.println("hs1 = " + hs1); //CIKTI: hs1 = [1, 2, 4, 5, 38, 22] //Ekledigimiz sirada tutmadi.Hizli calismak
        //ve tekrar etmemek.
        System.out.println("eklendiMi = " + eklendiMi);
        
        
        
        
        
        
        
        
        
    }
}
