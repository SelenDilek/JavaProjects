package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //Adini ve soyadini ayri ayri alip okut yazdir
        //birlikte de yazdir.
        Scanner oku = new Scanner(System.in); //bir scannerdaki degiskeni birden cok yerde kullanabiliriz "oku"
        System.out.print("Adinizi giriniz = ");
        String ad = oku.nextLine();
        System.out.print("Soyadinizi giriniz= ");
        String soyad = oku.next();

        System.out.println("Ad =" + ad);
        System.out.println("Soyad =" + soyad);
        System.out.println("Adiniz ve Soyadiniz = " + ad + " " + soyad);





    }
}
