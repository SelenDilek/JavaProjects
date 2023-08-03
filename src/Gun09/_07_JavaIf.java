package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
// Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde
        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();


        cumle=cumle.toLowerCase();

        if(cumle.contains("a")){

            System.out.println("VAR");
        }

        if(! cumle.contains("a")){

            System.out.println("YOK");
        }






    }
}
