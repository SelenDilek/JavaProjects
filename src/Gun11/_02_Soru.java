package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lutfen saati giriniz=");
        int saat = scan.nextInt();

        if (saat>0 && saat <= 3)
            System.out.println(" Ucret 10 TL" );

        else { //saat>3

            if (saat > 3 && saat <= 5)
                System.out.println(" Ucret 15 TL");

            else
                System.out.println(" Ucret 20 TL");

        }









    }
}
