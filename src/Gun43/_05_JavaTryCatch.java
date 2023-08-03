package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program basladi");

        try {
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30); //Subat 30 olamaz //RUNTIME ERROR
        }
        //hata oldugu zaman programi kirma.
        catch (Exception ex) { //ex isimli degiskene olusan hatalarin bilgisi ataniyor.

            //hata oldugunda yapilmasi istenenler buraya yaziliyor.
            System.out.println("Hata olustu = " + ex);
            System.out.println("ex.getMessage() = "+ ex.getMessage());
            //log tutabilirsin , ekranin fotografini alabilirsin.


        }

        System.out.println("Program bitti !");

       //Kurstaki hata yonetimi
        try{

            //Java ve Toollari calismaya devam et
            //Konulari grupla calismaya devam

        }//anlamadigin yerler mi oldu, runtime error
        catch (Exception e ){

            //hatanin sebebini anla
            //derse daha fazla odaklan
            //anlamadigin yerleri sor
            //videolari tekrar izle
            //grup calismasina devam et
        }


    }
}
