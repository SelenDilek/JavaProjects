package Tekrar;

import java.util.Scanner;

public class _06_Dizi {
    public static void main(String[] args) {
        int sayi=5 ;  // bir tane saklıyor.

        int sayi1;
        int sayi2;
        int sayi3;


        int[] dizi=new int[10]; //10 tan sayı tutuyor

        dizi[0]=5;
        dizi[1]=7;
        //...
        //...
        dizi[9]=45;

        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".sayi giriniz=");
            dizi[i] = oku.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+".sayi="+dizi[i]);
        }

        String cumle="Bu gün hava güzel";

        String[] kelimeler= cumle.split(" ");

        for (int i = kelimeler.length-1; i >=0 ; i--) {
            System.out.print(kelimeler[i]);
        }



    }
}
