package Gun27._01_Ornek;

import javax.xml.parsers.SAXParser;

public class Utility { //class in adi yani tipin adi.

    public String getString(int sayi){

        return String.valueOf(sayi);
        //string e cevir ver
    }

    //Eger bir method nesnenin ozelliklerini kullaniyorsa nesne olusturulmadan kullanilamaz.
    //Dolayisiyla static olamaz.
    //Nesne sart! .

    public static String getString2(int sayi){

        //statigin nesneye ihtiyaci yok nesneye degil class a bagli sadece , class altinda olusturuldu.
        //Bagimsiz methodlardir. Herhangi bir nesneye bagli calismasi gerekmeyen metodlardir.
        //Her yerden cagirayim , class adi ile cagirmam yeterli olsun diye kullanirim.

        return String.valueOf(sayi); //"5"
    }


}
