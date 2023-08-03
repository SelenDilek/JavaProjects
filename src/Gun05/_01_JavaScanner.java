package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi   adi    baslangic degeri
        int sayi = 5 ;

        Scanner okuyucu = new Scanner(System.in);
        //tipi     //adi    //yeni bir okuyucu olusturuldu ve(klavyeden-konsoldan)
        System.out.print("Sayi giriniz = ");
        int okunan = okuyucu.nextInt();
        //sayi girdikten sonra "bitti" yazisi cikar.
        System.out.println("okunan = " + okunan);
        System.out.println("bitti");
        
        
        
        
    }
}
