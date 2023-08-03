package Gun08;

import java.util.Scanner;

public class _03_StringReplaceAll {
    public static void main(String[] args) {
        //regex:kriter (regular expression)
        //ReplaceAll: replace gibi calisiir. farki kriter(regex) verebiliyor.
        //TODO(YAPILACAK): ODEV : regex olarak neler yazilabiliyor google dan arastirilacak!!


        String text = "Merhaba1 Dunya234";
        System.out.println("text = " + text);

        System.out.println("abn -> _ " + text.replaceAll("[abn]" , "_"));
        //a,b,n leri _ yap -> Merh___1 Du_y_234

        System.out.println("0-9 arasini sil= " + text.replaceAll("[0-9]" , ""));
        //0-9 arasini sil -> Merhaba Dunya

        System.out.println("0-9 disindakileri sil=" + text.replaceAll("[^0-9]" , ""));
        //0-9 un disindakileri sil ->1234
        //$500 var mesela "$" bunu kaldirecaz replace.All ile kaldirip oyle stringden int e ceviririz.


        //EXAMPLE##1
        String metin = "techno study türkçe içerik";
        // techno-study-turkce-icerik

        metin = metin.replace(" ", "-");
        System.out.println("metin = " + metin);

        metin = metin.replaceAll("[çÇ]", "c").replaceAll("[ıİ]", "i");
        metin = metin.replaceAll("[şŞ]", "s").replaceAll("[ğĞ]", "g");
        metin = metin.replaceAll("[üÜ]", "u");

        //metin = metin.replaceAll("[çÇşŞüÜıİ]", "");

        System.out.println("metin = " + metin);

        //#EXAMPLE2
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad ve soyad giriniz= ");
        String adveSoyad = scan.nextLine();

        char ilkHarf = adveSoyad.charAt(0);
        System.out.print("Ilk Harf=" + ilkHarf);
        System.out.println();
        int uzunluk = adveSoyad.indexOf(ilkHarf);
        int bosluk1 = adveSoyad.indexOf(" ");

        String metin2 = adveSoyad.substring(uzunluk+ (1) , bosluk1);
        System.out.println("metin2 = " + metin2);


        int uzunluk2 = adveSoyad.lastIndexOf(" ");
        int length = adveSoyad.length();
        String metin3 = adveSoyad.substring(uzunluk2+(2) , length);
        System.out.println("metin3 = " + metin3);

        adveSoyad = adveSoyad.replaceAll(metin2 , "*").replaceAll(metin3,"*");
        System.out.println("adveSoyad = " + adveSoyad);








    }
}
