package Gun10;

import java.util.Scanner;

public class _02_IfElse2 {
    public static void main(String[] args) {

        //Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();

        int kalan = sayi%2;
        //eksi sayida da pozitif sayidada mod2 sonucu sifirdir.
        //ciftler 0 (2,4,6,8,-2,-4,-6) tekler 1 (1,3,5) veya -1 (-1,-3,-5,-7..)

        System.out.print("kalan = " + kalan);

        //BURASI NEGATIF TEKLERDE CALISMIYOR
        if(kalan==1) //pozitif teklerde 1 durumunda
            System.out.println("TEK");
        else //hem 1 hem -1 ihtimali var burda
            System.out.println("CIFT"); // O KEN VE -1 IKEN DE CALISIYOR BURASI.

            //DOGRUSU TAM CALISANI
        if(kalan==1) //pozitif teklerde 1 durumunda
            System.out.println("TEK");
        else //hem 1 hem -1 ihtimali var burda
            System.out.println("CIFT");


    }
}
