package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //Girilem bir strigin sadce son harfini yazdiriniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen string giriniz : ");
        String cumle = oku.nextLine();
        System.out.println("cumle = " + cumle.length());
        int uzunluk = cumle.length();

        char sonHarf = cumle.charAt(uzunluk-1);
        System.out.println("Son harf =  " + sonHarf);

        //2.yontem :
        System.out.println("son harf = " + cumle.charAt(cumle.length()-1));









    }
}
