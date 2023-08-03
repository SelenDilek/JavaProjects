package Gun14;

import java.util.Scanner;

public class _02_DoWhile_2 {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        // DO-WHILE ILE COZUM :

        Scanner scan = new Scanner(System.in);
        String girilen ;
        do{

            System.out.print("harf giriniz=");
            girilen = scan.next();

            if(! girilen.equalsIgnoreCase("x"))
                System.out.println("PROGRAM CALISIYOR");

        }

        while (! girilen.equalsIgnoreCase("x")); //x e esit olmayana kadar calistirir ve do ya gider. x e estise bitirir alt satira iner
        System.out.println("PROGRAM BITTI");









    }
}
