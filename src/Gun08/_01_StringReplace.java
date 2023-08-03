package Gun08;

import java.util.Scanner;

public class _01_StringReplace {
    public static void main(String[] args) {
        //replace: bir string icindeki karekteri(leri) verilenle degistirir.hepsini
        String text = "Merhaba Dunya";
        System.out.println("text = " + text);
        //mesela turkce karakterleri yok etmek icin de kullanabiliriz.
        System.out.println("text.replace(a,e)=" + text.replace("a" , "e"));
        System.out.println("text.replace(ba,de)=" + text.replace("ba" , "de"));
        System.out.println("text.replace(Merhaba,Hello)=" + text.replace("Merhaba" , "Dunya"));
        //silme islemi de yapar :
        System.out.println("text.replace(a , '')=" + text.replace("a" , ""));

       //EXAMPLE#1
        String text2 = "Merhaba [NAME], Telefon doğrulama için onay kodunuz: [KOD].";
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsim giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Kod girin: ");
        String kod = scanner.nextLine();

        text2 = text2.replace("[NAME]", isim);
        text = text2.replace("[KOD]", kod);

        System.out.println("text = " + text);


        //EXAMPLE#2
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim giriniz=");
        String name = scan.nextLine();
        System.out.print("Code giriniz=");
        String code = scan.nextLine();
        String text1= "Lutfen adinizi _Name_ Code _code_ olarak giriniz !" ;

        text1 = text1.replace("_Name_" , name).replace("_code_" , code);

        System.out.println("text1 = " + text1);











    }
}
