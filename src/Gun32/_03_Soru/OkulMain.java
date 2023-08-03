package Gun32._03_Soru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("Bayram Lisesi",3);
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        do {
            System.out.print("Ogrenci adi giriniz = ");String ad = okuStr.nextLine();
            System.out.print("Ogrenci soyad giriniz = ");String soyad = okuStr.nextLine();
            System.out.print("Ogrenci yas giriniz = ");int yas = okuInt.nextInt();



            if(yas<15){

                Ogrenci ogr = new Ogrenci(ad,soyad,yas);
                okul.getOgrenciler().add(ogr);


            }
            else
                System.out.println("Yas okul icin uygun degildir !");



        }while (okul.getOgrenciler().size() < okul.getKontenjan());

        System.out.println(okul.getOgrenciler()); //okulda bulunan arraylistdeki ogrencileri yazdirdik.


        System.out.println("Kontenjan dolmustur");

        
    }
}
