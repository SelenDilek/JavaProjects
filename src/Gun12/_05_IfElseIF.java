package Gun12;

import java.util.Scanner;

public class _05_IfElseIF {
    public static void main(String[] args) {
// Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Dersadi:not bilgisi seklinde giriniz= "); //Fizik:90
        String notBilgisi = oku.nextLine();

        //90 kismini almamiz lazim.

        //1.YONTEM SUBSTRING
        int index = notBilgisi.indexOf(":");
        int not = Integer.parseInt(notBilgisi.substring(index + 1));
        System.out.println("not = " + not);

        //2.YONTEM REGEX

        not = Integer.parseInt(notBilgisi.replaceAll("[^0-9]", ""));
        System.out.println("not = " + not);


        if (not >= 90)
            System.out.println("A");
        else if (not >= 80)
            System.out.println("B");

        else if (not >= 70)
            System.out.println("C");

        else if (not >= 60)
            System.out.println("D");
        else if (not >= 40)
            System.out.println("E");

        else if (not < 40)
            System.out.println("F");

        else
            System.out.println("LUTFEN NOTU GIRINIZ");


    }
}
