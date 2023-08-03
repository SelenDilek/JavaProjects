package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        //Girilen bir adi ekrana yazdiriniz.

        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Isim giriniz = ");
        String okunanIsim = okuyucu.next(); // next kelime okur.
        System.out.println("okunanIsim = " + okunanIsim);
        System.out.println("BITTI");

        /*
        okuyucu.next() -> bir kelime okur.
        okuyucu.nextLine() -> cumle veya birden fazla kelimeyi okur.

        okuyucu.nextInt() -> bir tam sayi(int)
        okuyucu.nextShort() -> bir tam sayi(short)
        okuyucu.nextByte() -> bir tam sayi(byte)
        okuyucu.nextLong() -> bir tam sayi(long)


        okuyucu.nextDouble() -> bir tam sayi(double)
        okuyucu.nextFloat() -> bir tam sayi(float)

        okuyucu.nextBoolean() -> true veya false girisi icin







         */

    }
}
