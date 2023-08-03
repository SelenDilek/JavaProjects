package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)
        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen kg degerinizi giriniz : ");
        double kg = oku.nextDouble();
        System.out.print("Lutfen boy degerinizi giriniz : ");
        double boy = oku.nextDouble();

        System.out.println("Boyunuz : " + boy + " " + "Kilonuz : " + kg);

        double vucutIndex=kg/(boy*boy);
        System.out.println("Vucut kitle index degeriniz= " + vucutIndex);

        //ctrl+D son satiri aynen dublicate eder.
        //ctrl+F12 ve space tusu classlar arasi gezinmeyi on izleme yapmayi saglar.
        // ''' efaerte ''' ile discortta attigimiz kodlari duzgun yazar.
        // classi al surukle birak discortta class dosya olarak gozukur
        //material theme UI Lite var plugin kisminda istersen eklersin. Kaldirmak istersen plug inden indirdigini bul enable yap.






    }
}
