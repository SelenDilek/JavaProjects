package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Uretilecek sayi siniri = ");
        int sinir = oku.nextInt();



        int tutulanSayi = (int)(Math.random()*sinir) ;
        System.out.println("tutulanSayi = " + tutulanSayi);


        System.out.print("Tahmininiz = ");
        int tahmin = oku.nextInt();

        if(tutulanSayi==tahmin){
            System.out.println("TEBRIKLER");
        }
        else
            System.out.println("TEKRAR DENEYINIZ = " + tutulanSayi);







    }
}
