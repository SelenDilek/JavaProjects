package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();

        int kalan = sayi%2;
        //eksi sayida da pozitif sayidada mod2 sonucu sifirdir.
        //ciftler 0 (2,4,6,8,-2,-4,-6) tekler 1 (1,3,5) veya -1 (-1,-3,-5,-7..)

        if(kalan==0)
            System.out.println("Sayi cifttir.");
        else //hem 1 hem -1 ihtimali var burda
            System.out.println("Sayi tektir.");




    }
}
