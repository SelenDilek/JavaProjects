package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        //// Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        //        // kurallar :
        //        // 1) en az 8 karakter olmalı
        //        // 2) içinde pass kelimesi olmamalı(buyuk/kucuk)
        //        // 3) en fazla 12 karakter olmalı

        Scanner oku = new Scanner(System.in);
        System.out.print("Sifre giriniz = ");
        String sifre = oku.nextLine();

        System.out.println("sifre.length() == " + sifre.length());

        if(sifre.length()>=8 && sifre.length()<=12  && (! sifre.toLowerCase().contains("pass")))
            System.out.println("SIFRENIZ KURALLARA UYGUNDUR");
        else
            System.out.println("SIFRENIZ KURALLARA UYGUN DEGILDIR");



    }
}
