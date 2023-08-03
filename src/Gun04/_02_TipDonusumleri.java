package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogtNot1 = 98 ;
        byte ogtNot2 = 97 ;
        byte ogtNot3 = 99 ;
        byte ogtNot4 = 100 ;

        //kucugu buyuge atabilirsin {byte i int e atmak gibi}

        int toplamNot=ogtNot1+ogtNot2+ogtNot3+ogtNot4 ;
        int toplam2 = ogtNot1 ;
        System.out.println("toplamNot = " + toplamNot);
        System.out.println("toplam2 = " + toplam2);

        //roket patlamasi bu nedenden olmus buyuk veriyi kucuk veriye atmaya calismislar ve verilerin bazilari sigmamis kaybolmus.

        // programa bazen size ni bilmedigimiz veriler gelebilir buyuk de olabilir biz bunu kucuk bir yerde tutmak isteyebiliriz.

        ogtNot2= (byte) toplamNot;
        byte toplam3 = (byte)toplamNot ;
        System.out.println("toplam3 = " + toplam3);





        System.out.println("ogtNot2 = " + ogtNot2); //toplam 394 fakat biz 127 ile -128 degeri alir sonuc= -118 cikiyor.Bu donusumler onerilmez.
        //bu donusumler yani buyuk kucuge atanacaksa bildigim verileri atmamda fayda var.

        //hafiza cok onemli herkes olabildigince kucuk alan tutmaya calisiyor




    }
}
