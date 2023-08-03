package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //TERNARY ILE COZUNUZ!!!

        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lutfen saati giriniz=");
        int saat = scan.nextInt();

        String ucret = (saat<=3) ?   "10 TL" : (saat<=5) ?  " 15 TL" : "20TL" ;
        System.out.println("ucret = " + ucret);

        System.out.println((saat<=3) ?   "10 TL" : (saat<=5) ?  " 15 TL" : "20TL");



    }
}
