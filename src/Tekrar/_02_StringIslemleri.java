package Tekrar;

import java.util.Scanner;

public class _02_StringIslemleri {
    public static void main(String[] args) {
        //                      1111111
        //            01234567890123456
        String cumle="Bu gün hava güzel"; // index yani oda numarası

        System.out.println("cumle.length() = " + cumle.length());

        System.out.println("cumle.charAt(1) = " + cumle.charAt(1));//u

        System.out.println("cumle.indexOf(u) = " + cumle.indexOf("u"));//1

        System.out.println("cumle.contains(u) = " + cumle.contains("u"));

        Scanner oku=new Scanner(System.in);
        System.out.print("Sifre=");
        String sifre=oku.nextLine();

        System.out.print("Sifre Tekrar=");
        String sifreTekrar=oku.nextLine();

        Boolean esitMi=sifre.trim().equals(sifreTekrar.trim()); // sifre , tekrarSifre ye eşit mi
        System.out.println("esitMi = " + esitMi);

        // oku.Next: boşluğa kadar okur.
        // oku.NexLine : tüm satırı okur

        sifre="merhaba";
        String aranan1="m";
        String aranan2="M";
        sifre.contains(aranan1); // true
        sifre.contains(aranan2); // false

        boolean varMi=sifre.toLowerCase().contains( aranan2.toLowerCase()  ); // true
        System.out.println("varMi 1 = " + varMi);

        varMi=sifre.toUpperCase().contains( aranan2.toUpperCase()  ); // true
        System.out.println("varMi 2 = " + varMi);
    }
}
