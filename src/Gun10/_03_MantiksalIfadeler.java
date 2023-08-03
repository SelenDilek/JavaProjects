package Gun10;

import java.util.Scanner;

public class _03_MantiksalIfadeler {
    public static void main(String[] args) {
        //Logic statment-condition (Mantiksal Ifadeler)
        //&& ve isareti (shift+7) -> and
        // || veya isareti  (algr |) -> or
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();

        int kalan = sayi%2;

        if(kalan==1 || kalan== -1 ) //Sadece 1 iken calisiyor.
            System.out.println("TEK");

        else //0
            System.out.println("CIFT");




    }
}
