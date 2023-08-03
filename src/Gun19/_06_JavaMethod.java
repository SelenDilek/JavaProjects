package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {

        int sayi=55;

        if(sayi%2==0)
            System.out.println("m :cifttir");
        else
            System.out.println("m :tektir");

       //******************************************//

        OkuTekMiCiftMiYaz();




        //bir sayinin tekmi cift mi oldugunu yazdiriniz
        tekMiCiftMiYaz(55);
        tekMiCiftMiYaz(60);

    }

    public static void tekMiCiftMiYaz(int sayi){

        if(sayi%2==0)
            System.out.println("m :cifttir");
        else
            System.out.println("m :tektir");


    }



    public static void  OkuTekMiCiftMiYaz(){

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        tekMiCiftMiYaz(sayi); //FONKSIYONLARI FONKSIYONDAN CAGIRABILIRIZ!

      //  if(sayi%2==0)
        //    System.out.println("m :cifttir");
       // else
         //   System.out.println("m :tektir");


    }







}
