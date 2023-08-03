package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b
        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci kenar uzunlugunu giriniz : ");
        int a = oku.nextInt();
        System.out.print("Ikinci kenar uzunlugunu giriniz : ");
        int b = oku.nextInt();

        System.out.println("Dikdortgenin cevresi= " + 2*(a+b));
        System.out.println("Dikdortgenin alani= "+ (a*b));








    }
}
