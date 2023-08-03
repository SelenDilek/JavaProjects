package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //kullanicidan girecegi 2 sayinin birbirine esit mi olup olmadigi yazdirin
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 i giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi2 i giriniz = ");
        int sayi2 = oku.nextInt();
        
        Boolean esitMi = (sayi1==sayi2);
        System.out.println("Girilen sayilar birbirine esit mi ? ="  +  esitMi);

        
        
    }
}
