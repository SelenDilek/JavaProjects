package Gun14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        //WHILE ILE COZUM :

        Scanner scan = new Scanner(System.in);
        System.out.print("ifade giriniz=");
        String girilen=scan.next() ;


        while (! girilen.equalsIgnoreCase("x")) { // xgirilmiyorken
            System.out.println("PROGRAM CALISIYOR");
            System.out.print("ifade giriniz=");
            girilen=scan.next() ;

        }

        System.out.println("PROGRAM BITTI");

    }
}
