package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>(); //neyi listeleyecm , sayi mi , string mi , ogrenci mi,ders mi

        //cok veri var listeye atip dongu ile almak lazim.

        for (int i = 0; i <3 ; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Ogrenci adi=");
            ogr.ad = okuStr.nextLine();
            System.out.print("Ogrenci soyadi=");
            ogr.soyad = okuStr.nextLine();
            System.out.print("Ogrenci Sinifi=");
            ogr.sinif = okuInt.nextInt();
            System.out.print("Ogrenci adresi=");
            ogr.adres = okuStr.nextLine();

            ogrenciler.add(ogr);

        }

        for (Ogrenci o : ogrenciler) {

            System.out.println("o.ad = " + o.ad);
            System.out.println("o.soyad = " + o.soyad);
            System.out.println("o.sinif = " + o.sinif);
            System.out.println(" o.adres = " + o.adres);
        }



    }

}
