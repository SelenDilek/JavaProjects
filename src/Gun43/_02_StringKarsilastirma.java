package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1="Bugun hava cok guzel"; //ilkel tip oldugu icin degerleri karsilastirilir
        String cumle2="Bugun hava cok guzel";

        if(cumle1==cumle2) //referasnlari karsilastirir
            System.out.println("cumle 1 ve cumle 2 esit");

        else
            System.out.println("cumle 1 ve cumle 2 esit degil");


        if(cumle1.equals(cumle2)) //degerleri karsilastirir
            System.out.println("cumle 1 ve cumle 2 esit");

        else
            System.out.println("cumle 1 ve cumle 2 esit degil");

        //Referans Tiplerde ise durum

        String cumle3= new String("Bugun hava cok guzel"); //ekrandan okununca referans tip gibi dusunur
        String cumle4= new String("Bugun hava cok guzel");

        if(cumle3==cumle4) // == referans tiplerde REFERANSLARI ayni mi
            System.out.println("cumle 3 ve cumle 4 esit");

        else
            System.out.println("cumle 3 ve cumle 4 esit DEGIL");

        //manasi referanslari ayni mi?



        //Degerleri ayni mi
        if(cumle3.equals(cumle4)) //referanslari farkli olsa da degerlerine baksin.
            //equals her zaman degerleri karsilastirir.

            System.out.println("cumle 3 ve cumle 4 esit");

        else
            System.out.println("cumle 3 ve cumle 4 esit DEGIL");

        //OZET: Nesne(String) ve referans (dizi,ArrayList,Nesneler) tiplerde
        //HERZAMAN EQUALS kullanilir.
        // İlkel (Sayısal, boolean) tiplerde == kullanılır



    }
}
