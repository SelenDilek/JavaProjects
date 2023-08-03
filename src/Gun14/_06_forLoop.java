package Gun14;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {

        //0 dan 100e kadar olan cift sayilarin toplamini bulunuz.
        //toplam 50 yi gectiginde mesaj yaziniz.(50yi gecildi diye)

        //baslangici:0 , sonu belli 100 , artisi 2 ser : for dongusu

        int toplam = 0;

        //boolean anahtar gibi kullanilir.

        boolean sinirAsildi = false; //sinir asilmadiysa
        System.out.println("sinirAsildi = " + sinirAsildi);

        for (int i = 0; i <= 100; i = i + 2) {
            toplam = toplam + i;
            System.out.println("i = " + i);

            //flag islemi : bir kere yazdirmak istedik.
            if (toplam > 50 && sinirAsildi==false) {
                System.out.println("TOPLAM 50 YI gecti");
                sinirAsildi=true; //true oldugu icin bir daha donguye girmez bir kez yazdirmayi saglar.
            }
        }

        System.out.println("toplam = " + toplam);


    }
}
