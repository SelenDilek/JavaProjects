package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        //Girilen bir ogrenci notuna gore 50den buyuk esit ise gectiniz yazdiriniz
        //kucuk ise kaldiniz yazdiriniz.
        // if leri kullaninca iki defa is yapiyor tum if leri kontrol ediyor.tersi olsa bile kontrol ediyor.

        //birinciyi calistiriyorsa ikiye gitmesin bilgisayar bos yere yorulmasin if-else var.

        Scanner oku = new Scanner(System.in);
        System.out.print("Notu giriniz = ");
        int ogrNot = oku.nextInt();

        //1.yontem bilgisayar bos yere yoruluyor

        if(ogrNot>=50)
            System.out.println("Gectiniz");
        if(ogrNot<50)
            System.out.println("Kaldiniz");

        //2.yontem

        if(ogrNot>=50)
            System.out.println("Gectiniz"); //bunu yapinca asagiya gecmiyor bilgisayar bos yere yorulmuyor.
        else
            System.out.println("Kaldiniz");



    }
}
