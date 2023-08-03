package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
       //dizi nasil okunur ve nasil yazdirilir.
        Scanner oku = new Scanner(System.in);

       int [] dizi = new int[10]; //10 elemanli bir dizi tanimlandi. 0-9 a kadar index gider.

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print((i+1) + ". Sayi giriniz=");
            dizi[i]= oku.nextInt(); //0, 1 ,2, 3, 4, 5, 6, 7 ,8, 9
        }

        for (int i = 0; i < dizi.length; i++) {

            System.out.println("dizi["+ i +"] = " +  dizi[i] );
        }

    }
}
