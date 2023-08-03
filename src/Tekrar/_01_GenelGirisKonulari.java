package Tekrar;

import java.util.Scanner;

public class _01_GenelGirisKonulari {
    public static void main(String[] args) {
        System.out.println("merhaba dünya"); // out ekrana yaz
        // ln yazdıktan sonra bir alt satıra geç demek.

        System.out.println("merhaba");
        System.out.println(" Dünya");
        System.out.println(" merhaba");

        int sayi=5; // int yani tam sayı saklayacak
        String cumle="Bu gün ek çalışma"; // kelime veya cümle saklayabilirim
        // double, char, long, byte,short, float  10.5
        double ortalama=30.5;

        ortalama=sayi; // küçk bir alanı, büyük alana atıyorsun bir porblem olmaz
        sayi=(int)ortalama; // büyük alanı , küçük alana atıyordun dikkat veri kaybı olabilir

        // kullanıcıdan veri nasıl alınır
        Scanner okuyucu=new Scanner(System.in); // okuyucu

        System.out.print("sayi giriniz=");
        int okunanSayi=okuyucu.nextInt(); // ekrandan sayı oku sayı olarak ver
        System.out.println("okunanSayi="+ okunanSayi);


        Scanner okuStr=new Scanner(System.in);
        System.out.print("cumle=");
        String okunanCumle=okuStr.nextLine();
        System.out.println("okunanCumle = " + okunanCumle);

        System.out.println("merhaba");
        System.out.println("okunanCumle = " + okunanCumle);
    }
}
