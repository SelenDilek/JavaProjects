package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a
        Scanner oku = new Scanner(System.in);

        System.out.print("Karenin bir kenar uzunlugunu giriniz : ");
        int kenar = oku.nextInt();

        System.out.println("Karenin bir kenar uzunlugu = " +" "+ kenar);

        System.out.println("Cevre= " + (kenar+kenar+kenar+kenar) + " "+"cm");

        System.out.println("Alan="+ (kenar*kenar) +" "+ "m2");

        //Ikinci yol :
        int cevre = kenar+kenar+kenar+kenar;
        int alan=kenar*kenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);



    }
}
