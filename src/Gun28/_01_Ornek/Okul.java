package Gun28._01_Ornek;

import java.util.Scanner;

public class Okul {


    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in); //parantez icine bir seyler yazabiliyoruz

        //1.Yol

        Ogrenci ogr1 = new Ogrenci();
        ogr1.id=1;
        ogr1.ad="Ismet";
        ogr1.soyad="Temur";
        ogr1.sinif=6;
        System.out.println("Ad= " + ogr1.ad);

        //2.Yol

        Ogrenci ogr2 = new Ogrenci(3,"mehmet", "yilmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3.Yol

        Ogrenci ogr3 = new Ogrenci(3,"Ayse","Demir");
        System.out.println("ogr3.ad = " + ogr3.ad);



    }
}
