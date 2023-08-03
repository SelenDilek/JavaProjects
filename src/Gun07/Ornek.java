package Gun07;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Isim giriniz=");
        String name = oku.nextLine();
        
        //Selen = en kismini alacaz
        int uzunluk = name.length();
        String sonuc=name.substring(uzunluk-2);
        System.out.println("sonuc = " + sonuc);
        
        
        
    }
}
