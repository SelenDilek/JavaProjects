package Gun27.Deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Students student = new Students();
        Scanner scan = new Scanner(System.in);
        Scanner scaner = new Scanner(System.in);
        int toplam = 0 ;

        Lessons l1 = new Lessons();
        l1.dersAdi="Fizik";
        l1.dersSaati=15;

        Lessons l2 = new Lessons();
        l2.dersAdi="Mat";
        l2.dersSaati=20;

        student.dersler.add(l1);
        student.dersler.add(l2);

        student.yazdir();

        ArrayList<Students> ogrenciBilgileri = new ArrayList<>();
        ArrayList<Integer> ogrenciodemeleri = new ArrayList<>();
        
        for (int i = 0; i <2 ; i++) {

            Students s = new Students();
            System.out.print("Ogrenci adini giriniz = ");
            s.name=scan.nextLine();
            System.out.print("Ogrenci dersSaati giriniz = ");
            s.dersSayisi=scaner.nextInt();
            
            ogrenciBilgileri.add(s);

               int a = Students.odemeTutari(((int) (Math.random() * 100)) );
                ogrenciodemeleri.add(a);
                

                toplam=toplam + ogrenciodemeleri.get(i);
            
        }

        System.out.println("ogrenciodemeleri = " + ogrenciodemeleri);
        System.out.println("toplam = " + toplam);
        System.out.println("ogrenciBilgileri = " + ogrenciBilgileri);
      






        


        }
}
