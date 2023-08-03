package Gun09;

import java.util.Scanner;

public class _0o1_soru {
    public static void main(String[] args) {
        //girilen bir sayinin tek olup olmadigini yazdiriniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");

        int sayi = oku.nextInt();
        int kalan = sayi%2 ;
        boolean tekMi = (kalan==1);
        System.out.println("tekMi = " + tekMi);






    }
}
