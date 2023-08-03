package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Ogrenci Notunuzu giriniz=");
        int ogrNot= oku.nextInt();

        if(ogrNot>=50){
            System.out.println("GECTINIZ!");
        }

        if(ogrNot<50){

            System.out.println("UZGUNUZ , KALDINIZ!");
        }


    }
}

//abc123 gir abc kismini al empyt mi diye kontrol et 50den buyuk mu
