package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class TODO {
    public static void main(String[] args) {
        // TODO
        // Soru 3 :
        //  verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

        ArrayList<Integer> matNotlari = new ArrayList<>(); //bu tek boyutlu
        ArrayList<Integer> fizikNotlari = new ArrayList<>(); // tek boyutlu
        ArrayList<Integer> kimNotlari = new ArrayList<>(); // tek boyutlu


        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(30);
        fizikNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //Acaba bu notlari tek bir degiskene nasil atarim?
        /******************************/
        //ArrayList lerin ArrayList i :

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimNotlari);


        //// Soru 1:
        //        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        //        // her bir satıra yazdırınız
        //        // Matematik : 50 70 80
        //        // Fizik : 30 40
        //        // Kimya : 60 70 80 90

        ArrayList<String> dersler = new ArrayList<>();

        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");


        for (int i = 0; i < notlarListesi.size(); i++) {

            System.out.println("dersler = " + dersler.get(i) + " : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {

                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }

            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("**************** 2.Soru ********************");
        Scanner oku = new Scanner(System.in);
        System.out.print("Ders No (0-Mat , 1-Fizik , 2-Kim)=");

        int dersNo = oku.nextInt();

        dersNotlariniYazdir(dersNo , notlarListesi);

        OrtveGecenler(notlarListesi,dersNo);


    }


    public static void dersNotlariniYazdir(int dersNo,  ArrayList<ArrayList<Integer>> notlarListesi){


        for (int i = 0; i <notlarListesi.get(dersNo).size() ; i++) {

            System.out.print(notlarListesi.get(dersNo).get(i) + "\t");

        }

        System.out.println();
    }

    // TODO
    // Soru 3 :
    // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

    public static void OrtveGecenler(ArrayList<ArrayList<Integer>> notlarListesi,int dersNo){



        int toplam=0;
        double ortalama=0;
        for (int i = 0; i <notlarListesi.get(dersNo).size() ; i++) {

            toplam=toplam+notlarListesi.get(dersNo).get(i) ;


        }

        ortalama=toplam/notlarListesi.get(dersNo).size();

        System.out.println("ortalama = " + ortalama);


        int gecenSayisi=0;

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {

            if(notlarListesi.get(dersNo).get(i) >= ortalama)
                gecenSayisi++ ;

        }


        System.out.println("gecenSayisi = " + gecenSayisi);







    }



}

