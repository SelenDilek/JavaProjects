package Gun43;

import java.util.Scanner;

public class _04_JavaRuntimeException {
    public static void main(String[] args) {

        boolean dogruCalisti=true ;

        do {
            try { // hata bolmesine serit i cektik
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);

                dogruCalisti = true;

            } catch (Exception hata) { //hata olursa yakala ve asagidaki bolumu calistir
                //try-catch beraber kullanilir.
                //hata mesajlarini hata isimli Exception cinsinden degiskene attim.

                System.out.println("Hata olustu");
                System.out.println("hata= " + hata.getMessage());
                System.out.println("Lutfen 2.sayiyi 0 vermeyiniz!");

                dogruCalisti = false;


            }
        }while (! dogruCalisti); //dogru calismadigi surece dongu tekrarlanacak. dogruCalismadiysa don.


    }
}
