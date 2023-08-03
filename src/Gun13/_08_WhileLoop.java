package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan girecegi 6 sayidan tek olanlari toplayiniz.
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayac = 1 ;

        while (sayac<=6){
            System.out.print(sayac + ".sayiyi giriniz=");
            int sayi = scan.nextInt();

            if( sayi%2==1)
                toplam=toplam+sayi;

            sayac++ ;
        }


        System.out.println("toplam = " + toplam);







    }
}
