package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen sayi giriniz=");
        int sayi = scan.nextInt();

        int sonuc = (sayi>50) ? 1 :  0 ;
        System.out.println("sonuc = " + sonuc);

        System.out.println((sayi>50) ? 1 :  0 );



    }
}
