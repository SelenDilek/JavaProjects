package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.
        //SWITCHCASE ILE COZUNUZ

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz=");
        int sayi1 = scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz=");
        int sayi2 = scan.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplama icin T  giriniz= \nCikartma icin C giriniz= \nCarpma icin P giriniz= \nBolme icin B giriniz=");
        String secim = scanner.next(); //T , C , P , B
        System.out.println("secim = " + secim);


        switch (secim.toUpperCase()){

            case "T" :
                System.out.println("toplam = " + (sayi1+sayi2));
                break;
            case "C" :
                System.out.println("cikartma = " + (sayi1-sayi2));
                break;
            case "P" :
                System.out.println("carpma = " + (sayi1*sayi2));
                break;
            case "B" :
                System.out.println("bolme = " + (double)(sayi1/sayi2));
                break;
            default:
                System.out.println("HATALI GIRIS YAPTINIZ");


        }







    }
}
