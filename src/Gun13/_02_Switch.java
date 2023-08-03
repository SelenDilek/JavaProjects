package Gun13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {
        //// Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        //        // 234  -> birler basamağı -> 4  -> dört
        //Muhasebe islemlerinde kullanilir mesela yazi ile tutarin yazilmasi.Veya fislerde.
        //TC no ucus kodu rakamlari parcalar ve tek tek soyler.
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = scan.nextInt();
        
        int birlerBasamagi =sayi%10;
        

        switch (birlerBasamagi){
            case 0 :
                System.out.println("sifir"); break;
            case 1 :
                System.out.println("bir"); break;
            case 2 :
                System.out.println("iki"); break;
            case 3 :
                System.out.println("uc"); break;
            case 4 :
                System.out.println("dort"); break;
            case 5 :
                System.out.println("bes"); break;
            case 6 :
                System.out.println("alti"); break;
            case 7 :
                System.out.println("yedi"); break;
            case 8 :
                System.out.println("sekiz"); break;
            case 9 :
                System.out.println("dokuz"); break;
            default:
                System.out.println("Hatali giris");

        }
        
        
        
        
        
        
        
        
        
    }
}
