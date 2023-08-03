package Tekrar;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // bu cümleyi tersten yazdırınız.
        String cumle="Bu gün hava güzel";

        //length-1 den başlıyoruz 0 kadar : for
        for(int i=cumle.length()-1 ; i>=0 ;i-- )
            System.out.print(cumle.charAt(i));


        // bir cümlede aranan bir harf kez kullanılıyor.
        System.out.println();
        char arananHarf='b';
        int tekrarSayisi=0;
        for (int i = 0; i < cumle.length(); i=i+1) {

//            String aranan= Character.toString(arananHarf);
//            String cumleninHarfString= Character.toString( cumle.toUpperCase().charAt(i));

            String aranan=arananHarf+"";
            String cumleninHarfString=cumle.toUpperCase().charAt(i)+"";

            if (cumleninHarfString.equalsIgnoreCase(aranan))
                tekrarSayisi++;

        }

        System.out.println("tekrarSayisi = " + tekrarSayisi);


        // bu gün hava güzel , güzel hava gün bu






    }
}
