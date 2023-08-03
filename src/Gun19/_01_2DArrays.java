package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.
/*
        Scanner oku = new Scanner(System.in);
        int dizi[][]=new int [3][2];
        int dizi2[]=new int[3];

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length; j++) {

                System.out.print("Lutfen sayi giriniz=");
                dizi[i][j]=oku.nextInt();
            }
        }

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length; j++)

                System.out.print(dizi[i][j]);
            System.out.println();

        }

        int a=0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length; j++) {
                if (dizi[i][j] % 2 == 1) {
                    for (int k = 0; k < dizi2.length; k++) {
                        dizi2[k] = dizi[i][j];


                    }
                }
            }

System.out.print(Arrays.toString(dizi2));

*/



        Scanner oku = new Scanner(System.in);

        int [][] tablo = new int [3][2]; //3 satir 2 sutun
        int tekMik=0;

        //okuma islemi yapildi , tablonun tum hucreleri sayi ile dolduruldu
        for (int i = 0; i <3 ; i++) { //satir
            for (int j = 0; j <2 ; j++) { //sutun

                System.out.print("Sayi giriniz=");
                tablo[i][j]=oku.nextInt(); //00 01 - 10 11 - 20 21
                if(tablo[i][j]%2==1)
                    tekMik++;

            }

        }

        int[] tekler = new int [tekMik]; //teklerin miktari kadar bir dizi tanimlandi

        int teklerIndex=0;
        for (int i = 0; i <3 ; i++) { //satir
            for (int j = 0; j < 2; j++) { //sutun
                if(tablo[i][j]%2==1) {
                    tekler[teklerIndex] = tablo[i][j];
                    teklerIndex++;
                }

            }
        }


        System.out.print(Arrays.toString(tekler));


    }
}
