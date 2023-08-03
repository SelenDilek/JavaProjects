package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //Ternary Operatoru
        //Kullanicinin giricegi sayinin cift mi tek mi oldugunu yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println(" Lutfen sayi giriniz=" );
        int sayi = oku.nextInt();

        if(sayi%2 == 0 )
            System.out.println(" CIFT" );
        else
            System.out.println("Tek");

        //1.kisa yontem
        //if else gibi calisir fakat kisa yoludur.If olan her seyde kullanilir
        String sonuc = (sayi%2 == 0) ? "cift" : "tek" ; // ? -> if : else
        System.out.println("sonuc = " + sonuc);

        //2.kisa yontem

        System.out.println((sayi%2 == 0) ? "cift" : "tek");



    }
}
