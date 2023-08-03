package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        ///        Eğer cumle 10 karakterden uzunsa VE study içeriyorsa
        ////                 EVET yaz
        ////        değilse
        ////                 HAYIR yaz
        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        System.out.println("cumle.lebght() = "+cumle.length());

        if(cumle.length()>10 && (cumle.toLowerCase().contains("study")))
            System.out.println("EVET");
        else
            System.out.println("HAYIR");








    }
}
