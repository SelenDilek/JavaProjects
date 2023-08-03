package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kullanicidan adini ve soyadini alip ekrana yazdiriniz.
        //Adiniz ve Soyadiniz = Selen Dilek
        Scanner oku = new Scanner(System.in);//okuma islemini yapacak olan degisken tanimlanir
        System.out.print("Lutfen adinizi ve soyadinizi giriniz  =  ");
        String aDveSoyad = oku.nextLine(); // next yazarsak sadece Selen i alir.
        System.out.println("Adiniz ve Soyadiniz = " + aDveSoyad);
        System.out.println("Bitti");

    }
}
