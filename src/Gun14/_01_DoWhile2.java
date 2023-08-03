package Gun14;

import java.util.Scanner;

public class _01_DoWhile2 {
    public static void main(String[] args) {
        //dongunun bir kez de olsa calismasini istiyorsak ve bir deger almasini istiyorsak do-while kullanilir.
        //dongunun sarti basta ise while sonda ise do-while kullanilir.

        // kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;

        do { //bu dongu en az bir kez calisir
            System.out.print("sayi giriniz=");
            sayi = scan.nextInt();
            toplam = toplam + sayi; //ilk toplayacak cunku disaridan bir deger ile donguye geliyor.
        }


        while (sayi != 0); //sart kontrolu sonda

        System.out.println(toplam);


    }
}
