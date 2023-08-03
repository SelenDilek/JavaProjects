package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class OdevCozum {
    public static void main(String[] args) {

// 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // TODO : sadece ilk rakamın yerini versin
        // TODO : bulamadığında bulamadım desin.
        //sayi uret ayni sayi arat arattigin sayidan ayni olanlardan ilkinin indexini goster

        int dizi[] = new int[50];

        for (int i = 0; i < dizi.length; i++) {

            int random = (int) (Math.random() * 6);

            dizi[i] = random;


        }

        System.out.println("Dizi once = " + Arrays.toString(dizi));

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen rakam giriniz(1-5)=");
        int arananRakam = scan.nextInt();

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]== arananRakam) {
                System.out.println("Buldum ve indexi= " + i);
                break;
            }
            else
                System.out.println("BULAMADIM");

        }



        }



    }


