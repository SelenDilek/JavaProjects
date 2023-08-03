package Gun17;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {
        //cumle.split(" ") bize bir dizi verir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle giriniz =");
        String cumle = scan.nextLine();


        String[] kelimeler1 = cumle.split("va"); //va ya gore boler
        String[] kelimeler = cumle.split(" "); //bosluga gore boler
        System.out.println("kelimeler.length = " + kelimeler.length);

        for (int i = 0; i <kelimeler.length ; i++) {

            System.out.println("kelimeler= " + kelimeler[i]);
        }

        /*
        iklimler çok  değişti

        String[] kelimeler=cumle.split(" ");

        kelimeler[0] -> "iklimler"
        kelimeler[1] -> "çok"
        kelimeler[2] -> "değişti"
        kelime.length -> 3
         */


    }
}
