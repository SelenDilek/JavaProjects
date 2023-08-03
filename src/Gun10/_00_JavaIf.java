package Gun10;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {

        //Kullanicinin 2 kez girecegi sifresinin ayni oldugunu
        //ayni veya degil seklinde cevaplayiniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Sifre giriniz=");
        String sifre = scan.nextLine();
        System.out.println("Sifreyi tekrar giriniz=");
        String sifreConfirm = scan.nextLine();

        //odalalari mi yoksa atadigi deger mi bilemiyor o yuzde sifre==sifreConfirm yapamayiz odalaei karsilastiriyor:
        if(sifre==sifreConfirm) //String lerde hafizadaki yerleri kontrol eder.
            System.out.println("AYNI");

        //Olmasi gereken String ifadelerde bu is icin yapilmius olan
        //icerik karsilastirici olan equals kullanilmali

        //String karsilastirmalarda == kulanilmaz

        if(sifre.equals(sifreConfirm)){

            System.out.println("AYNI");
        }

        if(! sifre.equals(sifreConfirm)){

            System.out.println("DEGIL");
        }

        //2.yol
        if(sifre.equals(sifreConfirm)==true){

            System.out.println("AYNI");
        }

        if(! sifre.equals(sifreConfirm) ==false){

            System.out.println("DEGIL");
        }

    }
}
