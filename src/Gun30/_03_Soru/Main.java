package Gun30._03_Soru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //final static int birgundekiSaatBilgisi=24;
        Scanner okuInt = new Scanner(System.in);
        int gun=0;
        int saat=0;
        int dakika=0;



        System.out.print("Lutfen gun giriniz= ");
         gun = okuInt.nextInt();
        System.out.print("Lutfen saat giriniz= ");
         saat = okuInt.nextInt();
        System.out.print("Lutfen dakika giriniz= ");
        dakika = okuInt.nextInt();

        int saniyeSonuc=Sabitler.Saniyehesapla(gun,saat,dakika);

        System.out.println("Girmis oldugunuz bilgiler : ");
        System.out.println("Gun = " +gun + " " + "Dakika = " + " " + dakika + " " + "Saat = " + " " + saat );
        System.out.println("---------");
        System.out.println("Saniye miktari = " + saniyeSonuc);

        //IKINCI YOL

        int toplamSaniye = gun
                           *Sabitler.gunSaat
                           *Sabitler.birSaatekidakika
                           *Sabitler.birDakikadakiSaniye
                           +
                           saat
                           *Sabitler.birSaatekidakika
                           *Sabitler.birDakikadakiSaniye
                           +
                           dakika
                           *Sabitler.birDakikadakiSaniye ;
        System.out.println("toplamSaniye = " + toplamSaniye);








    }
}
