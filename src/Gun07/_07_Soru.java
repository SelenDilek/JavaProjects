package Gun07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //Tek seferde girilen bir ad ve soyadin (tam ad) adini ve soyadini ayirip, ayri ayri yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Adiniz ve Soyadiniz=");
        String adSoyad = oku.nextLine(); //Selen Dilek

        //0-boslugun indexine kadar desem : adi
        //boslugun indexi +1 den sonrasini desem : soyadi verir.

        int boslukIndex = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0,boslukIndex);
        System.out.println("ad = " + ad); //Selen


        String soyad = adSoyad.substring(boslukIndex+1 );
        System.out.println("soyad = " + soyad); //Dilek



        System.out.println(adSoyad.length());
        System.out.println(adSoyad.substring(4));













    }
}
