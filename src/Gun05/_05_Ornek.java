package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Birinci tam sayiyi giriniz sayi1= ");
        int sayi1= oku.nextInt();

        System.out.print("Ikinci tam sayiyi giriniz sayi2= ");
        int sayi2= oku.nextInt();


        System.out.println("Birinci tam sayi = " + sayi1);
        System.out.println();
        System.out.println("Ikinci tam sayi = " + sayi2);
        System.out.println();
        System.out.println("Iki tam sayinin toplami = " + (sayi1+sayi2));




    }
}
