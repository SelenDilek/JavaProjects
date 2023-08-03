package Gun14;

import java.util.Scanner;

public class _01_DoWhile {
    public static void main(String[] args) {
// kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz
        Scanner scan = new Scanner(System.in);
        int toplam = 0 ;
        //Ilk adimi disari aldik cunku sayinin bir ilk degeri lazim dobguye girmesi icin.
        System.out.print("sayi giriniz=");
        int sayi = scan.nextInt();
        toplam = toplam + sayi; //ilk toplayacak cunku disaridan bir deger ile donguye geliyor.


        while(sayi != 0 ){ //bir kere donguye girmesi sarta bagli // sifir olmadigi zaman


            System.out.print("sayi giriniz=");
            sayi = scan.nextInt();

            toplam = toplam + sayi;

        }

        System.out.println(toplam);










    }
}
