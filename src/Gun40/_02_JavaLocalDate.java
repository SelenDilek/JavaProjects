package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate :  Sadece gun ay yil bilgisini tutar

        LocalDate tarih = LocalDate.now();
        DateTimeFormatter oz6 = DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM EEEE dd.MM.yyyy= " + tarih.format(oz6));

        System.out.println("***** baska dilde formatta gosterelim ******");

        //Lokalden aldigim tarihi baska dilde formatta gosterimi
        System.out.println("oz6 = " + tarih.format(oz6.withLocale(Locale.GERMANY)));

        //Lokalizasyon tanimlamasi ne demek
        //en-US :  Amerikanin Ingilizce  konusulan lokalizasyonu(Bolgesi)
        //en-UK :  Ingilterenin ingilizce konusulan lokalizasyonu(Bolgesi)
        //fr-CA : Kanadanin fransizca konusulan lokalizasyonu(Bolgesi)
        //en-CA :  Kanadanin ingilizce konusulan lokalizasyonu(Bolgesi)
        // dil-ulke (birden fazla dil konusulan ulkeler var)
        //tr-TR :  Turkiyenin turkce konusulan lokalizasyonu(Bolgesi)

        Locale lCince = new Locale("zh", "CH"); //Cinin zh konusulan bolgesi
        System.out.println("Cince Tarih = "+tarih.format(oz6.withLocale(lCince)));
        
        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();
        for(Locale l : kullanilabilirLokaller){

            if(! l.getDisplayCountry().toLowerCase().contains("tur")) continue; //tur kelimesini bulundurmayanlari pass gec yazdirma.

            System.out.print("Dili = " + l.getDisplayLanguage());
            System.out.print(",Ulkesi = " + l.getDisplayCountry());
            System.out.print(",Dili= " + l.getLanguage());
            System.out.print(",Ulkesi = " + l.getCountry());
            System.out.println();
        }


        Locale lTurkiye = new Locale("tr","TR");
        System.out.println(" Turkce tarih = " +tarih.format(oz6.withLocale(lTurkiye)));


        System.out.println("\n**************************************************");
        //tarih = 2053-5-20 gibi kendimiz bir tarihi nasil set ederiz..

        LocalDate tarih1 = LocalDate.of(2053,5,20);
        LocalDate tarih2=LocalDate.of(2053, Month.MAY,20);
        System.out.println("tarih1 = " + tarih1.format(oz6));
        System.out.println("tarih2.format(oz6) = " + tarih2.format(oz6));






    }
}
