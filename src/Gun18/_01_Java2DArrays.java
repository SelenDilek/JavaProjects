package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        
        int sayi=0 ; //1 tane sayi sakliyor
        int [] dizi = new int [100]; //100 sayi
        
        int [] ders1Not = new int[50]; //50 kisilik ders1 in notlari
        int [] ders2Not = new int[50]; //50 kisilik ders2 in notlari
        int [] ders3Not = new int[50]; //50 kisilik ders3 in notlari
        
        int[][] tumDersNotlari = new int [3][50]; //3 tane 50lik sayi tutabiliyor. Index 0dan baslar satir 2ye kadar sutun 49a kadar
        
        ders1Not[0]=80; // tek boyutlu bir dizinin ilk elemani
        
        //matris , 2Ddizi.. , tablo
        
        tumDersNotlari[0][0]=80; //2 index ile gosterilir //sonuc bir sayidir.(int oldugu icin) //TABLONUN ILK ELEMANI

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0]=oku.nextInt();

        
        
        
        
        
        
        
        
        
        
        
    }
}
