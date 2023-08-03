package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
      //Girilen  5 sayının toplamının sonucunu yazdırınız

        Scanner scan = new Scanner(System.in);

        int sayac = 1;
        int toplam = 0;

        while (sayac <= 5) {

            System.out.print(sayac + ".sayi giriniz=");
            int sayi = scan.nextInt();

            toplam = toplam + sayi;

            sayac++;

        }

        System.out.println("toplam = " + toplam);


    }
}
