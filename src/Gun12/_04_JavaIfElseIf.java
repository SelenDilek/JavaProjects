package Gun12;

import java.util.Scanner;

public class _04_JavaIfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi1 giriniz= ");
        int sayi1 = scan.nextInt();
        System.out.print("sayi2 giriniz= ");
        int sayi2 = scan.nextInt();

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Toplama icin T  giriniz= \nCikartma icin C giriniz= \nCarpma icin P giriniz= \nBolme icin B giriniz=");
        String secim = okuyucu.next(); //T , C , P , B
        System.out.println("secim = " + secim);

        //Merdivenli if , ladder if
        if(secim.equalsIgnoreCase("T")) {
            System.out.println("toplam = " + (sayi1+sayi2)); }

        else
           if(secim.equalsIgnoreCase("C")) {
              System.out.println("cikartma = " + (sayi1-sayi2));}

         else
            if(secim.equalsIgnoreCase("P")){
               System.out.println("carpma = " + (sayi1*sayi2));}

            else
               if(secim.equalsIgnoreCase("B")){
                   System.out.println("bolme = " + (double)(sayi1/sayi2));}
               else
                   System.out.println("Hatali giris");

               //alt altta if ler yazabilirdik ama bilgisayar bosuna yorulurdu. O yuzden else kullandik.











    }
}
