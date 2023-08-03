package Gun16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {
        //50 kisilik bir sinifin notlarini giriniz ve ortalamalarini giriniz ve ortalamadan buyuk
        //kac not oldugunu bulunuz ve bunlari yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("50 adet not giriniz!");
        int [] notlar = new int[5];
        int toplam=0;
        int gecenler=0;


        for (int i = 0; i < notlar.length ; i++) {
            System.out.print((i+1) +".notu giriniz=");
            notlar[i]= oku.nextInt();

            toplam=toplam+notlar[i];

        }

        double ortalama=toplam/ notlar.length;
        System.out.println("ortalama = " + ortalama);



        for (int i = 0; i < notlar.length ; i++) {


            if(notlar[i]>= ortalama) {
                System.out.println(notlar[i]);
                gecenler++;
            }
        }
        System.out.print("gecenler = " +gecenler +"\n" + gecenler +  " tane ortalamadan buyuk not vardir.");





    }
}
