package Gun30._03_Soru;

public class Sabitler {
//2 gun 5 saat 6 dk = toplami

  final static  int gunSaat=24;
    final static int birSaatekidakika=60;
   final static int birDakikadakiSaniye= 60;



    public static  int  Saniyehesapla(int gun , int saat , int dakika){

        int saniye=(gun*gunSaat*birDakikadakiSaniye*birSaatekidakika) + (saat*birSaatekidakika*birDakikadakiSaniye) +  (dakika*birDakikadakiSaniye) ;



        return saniye;
    }




}
