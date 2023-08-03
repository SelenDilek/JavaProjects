package Gun10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {

        //Girilen sayi pozitif ve tek ise , ekrana uygun sayi girildi
        //degilse uygun sayi girilmedi seklinde yaziniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();


        if (sayi>0 && (sayi%2==1)) {
            System.out.println("UYGUN SAYI GIRILDI");
        }
        else
            System.out.println("UYGUN SAYI GIRILMEDI");













    }
}
