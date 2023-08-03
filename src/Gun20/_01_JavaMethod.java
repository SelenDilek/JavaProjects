package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
// Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku = new Scanner(System.in);

        int dizi[] = new int[5];


        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Sayi giriniz=");
            dizi[i] = oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi));
        enBuyukYaz(dizi);
        enKucukYaz(dizi);
        ortalamaYaz(dizi);


    }

    public static void enBuyukYaz(int[]dizi){

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("en buyuk = " + dizi[dizi.length-1]); //sondaki


    }

    public static void enKucukYaz(int[]dizi){

        Arrays.sort(dizi);
        System.out.println("en buyuk = " + dizi[0]); //bastaki


    }


    public static void ortalamaYaz(int[]dizi){

        double toplam=0;


        for (int i = 0; i < dizi.length ; i++) {

           toplam=toplam+dizi[i];

    }
        System.out.println("Toplam = " + toplam);
       double ortalama=toplam/ dizi.length;
        System.out.println("Ortalama = "+ortalama);




















   /* public static void diziOlustur(int dizi[]){

        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Lutfen eleman giriniz.");
            int sayi = oku.nextInt();
        }
        System.out.print(Arrays.toString(dizi));

        for (int i = 0; i < dizi.length ; i++) {
            int enKucuk=i;
           if(dizi[i]>dizi[i+1]){

               enKucuk=dizi[i+1];
           }
            System.out.println(enKucuk);

        }

        for (int i = 0; i < dizi.length ; i++) {
            int enBuyuk=i;
            if(dizi[i]<dizi[i+1]){

                enBuyuk=dizi[i+1];
            }
            System.out.println(enBuyuk);

        }

        for (int i = 0; i < dizi.length ; i++) {
          int toplam=0;
          int ortalama=0;

          toplam=toplam+dizi[i];
          ortalama=toplam/ dizi.length;
            System.out.println(ortalama);
        }

*/





    }




}
