package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
// kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup mainden yazdırınız
        // Örn: 5 girildiyse -> 12345 i bulmalısınız


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayiyi giriniz= ");
        int sayi=oku.nextInt();

        int carpim=faktoryel(sayi); //donen var , esitlenebiliyorsa
        System.out.println("carpim= "+carpim);
        
        int sonucFac=facHesapla(1);
        System.out.println("sonucFac = " + sonucFac);


    }

    public static int faktoryel(int sayi){

        int carpim=1;
        for (int i = 1; i <=sayi ; i++)
            carpim=carpim*i ; //1*1 -> 1*2 -> 2*3 -> 6*4 -> 24*5 -> 120


        return carpim;
    }
    
    public static int facHesapla(int fac){

        if(fac<=1)
            return 1;

      int sonucS= fac*facHesapla(fac-1);
        
        return sonucS;
    }




}
