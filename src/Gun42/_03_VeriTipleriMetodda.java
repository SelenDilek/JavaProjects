package Gun42;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        //ilkel tip
        
        int sayi=5;
        sayiArttir(sayi); //SADECE DEGERI GITTI KENDISI DEGIL
        System.out.println("sayi = " + sayi);
        
        sayi=sayiArttir2(sayi);

        System.out.println("sayi = " + sayi);
        
        
        //Referans Tiplerde(new) //new ile yaptigin her sey returnsuz kendini gonderir

        int dizi[] = new int[] {1,2,3,4};
        diziSifirla(dizi); //giden referansi ise 0000 , degilse 1234
        System.out.println("dizi = " + Arrays.toString(dizi)); //0000 //diziyi return yapmadan islem yaptirdi kendisi gitmis degeri degil.


        //Nesn Tipler (String (Stringler ilkel tiplerdir))
        //String de new leniyor fakat ilkeldir degeri gider kendisi degil..

        String kelime="ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime); //ismet



        /////NOT/////

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.


    }

    public static void kelimeSifirla(String kelime){

        kelime="";

    }

    public static void diziSifirla(int dizi[]){ //gelen referansi(adini) ise yani kendisi ise 0000 yazar , degilse 1234
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
        dizi[3]=0;


    }

    public static void sayiArttir(int sayi){ //ilkel tiplerde sadece deger gelir ismi ayni olsa bile. //birbiri ile alakasi yok
        
        sayi++ ;
        
    }

    public static int sayiArttir2(int sayi){ //degeri geri gondermek lazim

        sayi++ ;

        return sayi++ ;
    }
}
