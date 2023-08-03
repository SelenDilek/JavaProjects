package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
       Kisi kisi1 = new Kisi();
      // kisi1.ad="Selen";
      // kisi1.soyad="Dilek";
       //private yaptik diye yazamadik
      // kisi1.yas=-25 ; //kullanicinin bu tip yanlis hatalar yapmasinin onune nasil geceriz?

        //Private hale getirip verileri korumaya alma islemi. Koruma islemi gelen veriyi degerlendirerek yapariz.

        kisi1.setAd("Selen");
        kisi1.setSoyad("Dilek");
        kisi1.yasAta(-25);

        System.out.println("kisi1.getAd() = " + kisi1.getAd());
        System.out.println("kisi1.getSoyad() = " + kisi1.getSoyad());
        System.out.println("kisi1.getSoyad() = " + kisi1.getSoyad());

        //degiskene direk erisimi kapattik
        //bir metod ile korumali veri gonderme ve alma
        //islemine Encapsulation denir.



    }
}
