package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();

        String sonuc = sayi ==0 ? " Sayi sifirdir" : sayi > 0 ? "Pozitif" : "Negatif";

        System.out.println("sonuc = " + sonuc);

        //2.yol

        System.out.println(sayi < 0 ? " Negatif" : sayi > 0 ? "Pozitif" : "Sayi sifirdir");


    }
}
