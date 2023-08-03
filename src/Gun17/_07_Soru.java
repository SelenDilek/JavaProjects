package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
// 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

     /*   Scanner scan = new Scanner(System.in);
        System.out.print("Rakam giriniz = ");
        int rakam = scan.nextInt();

        int dizi[] = new int[10];

        for (int i = 0; i <dizi.length ; i++) {

            int random = (int)(Math.random()*11);
            System.out.println("random = " + random);
            dizi[i]=random ;

            System.out.println("dizi[i] = " + dizi[i]);

        }

        for (int i = 0; i <dizi.length; i++) {
            if(dizi[i] == rakam )
            {  System.out.println("dizi ve eleman esit ve indexi= " + i); }


        } */


        int dizi[] = new int[10]; //10 elemanli bir diziyi tanimlayalim


        for (int i = 0; i < dizi.length; i++) //diziyi random10 dahil sayilarla doldurduk

            dizi[i] = (int) (Math.random() * 11);

        System.out.println("dizi[i] = " + Arrays.toString(dizi));

        Scanner scan = new Scanner(System.in);
        System.out.print("Aranacak sayi(0-10) = ");
        int arananRakam = scan.nextInt(); //kullanicidan girecegi bir rakami

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananRakam) {
                System.out.println("Var ve indexi= " + i);
            }

        }


    }
}
    // TODO  ilk rakami versin bulamadiginda bulamadim desin  odev!!\\