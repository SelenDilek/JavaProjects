package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner oku = new Scanner(System.in);
        int dizi [] = new int[7];
        double toplam=0;
        int miktar=0;

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print((i+1) +".sayiyi giriniz = " );
            dizi[i]= oku.nextInt();
            
            toplam=toplam+dizi[i];
            
        }
        
        double ortalama = toplam / dizi.length ;

        for (int i = 0; i < dizi.length; i++) {
            
            if(dizi[i] > ortalama && (dizi[i]%2==1)){

                miktar++; //miktar=miktar+1 ;
                
            }
            
        }
        System.out.println("ortalama = " + ortalama);

        System.out.println("Ortalamadan buyuk ve tek sayilarin miktari = " + miktar);










    }
}
