package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {

        ///  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int a = oku.nextInt();
        int b = oku.nextInt();
        int c= oku.nextInt();

        int enbABden= Math.max(a,b);
        int enb = Math.max(c,enbABden);

        System.out.println("enb = " + enb);

        //2.yontem
        System.out.println(Math.max(c,Math.max(a,b)));

        //RANDOM

        double sayi =  Math.random();
        System.out.println("sayi= " +sayi);

        sayi = sayi * 1000 ;

        sayi = Math.round(sayi) ;

        System.out.println("sayi = " + sayi);

        String kelime = sayi + " " ;
        System.out.println("kelime = " + kelime);
        kelime = kelime.substring(0,2);

        System.out.println("kelime = " + kelime);

        String kod = String.valueOf(kelime);
        System.out.println("kod = " + kod);







    }
}
