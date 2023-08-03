package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        //Kulaniciyi ogrenci misiniz seklinde sorunuz,evet ise true degilse false degerini veriniz ve yazdiriniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Ogrenci misiniz= ");
        Boolean cevap = oku.nextBoolean(); // bu ekrandan sadece true false okur
        System.out.println("cevabiniz = " + cevap);
    }
}
