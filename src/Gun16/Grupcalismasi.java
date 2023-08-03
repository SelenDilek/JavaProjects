package Gun16;

import java.util.Scanner;

public class Grupcalismasi {
    public static void main(String[] args) {
        /*
        //GİRİLEN KİŞİ GRUBUN ÜYESİMİ DİYE KONTROL EDİNİZ
        //UYE İSE "bu grubun üyesidir" DEĞİL İSE " bu grubun üyesi DEĞİLDİR." YAZDIRINIZ

        Scanner scanner=new Scanner(System.in);


        String[] uyeler={"umut","emrullah","ümit","aykut","samet","selen"};
        boolean uyevar=false;
        System.out.print("kontrol etmek isteğiniz isim=");
        String kontrol = scanner.nextLine();

        for (int i = 0; i < uyeler.length; i++) {
            if (kontrol.equalsIgnoreCase(uyeler[i])) {
                uyevar=true;
            }

        }

        if (uyevar==true)
            System.out.println(kontrol+"bu grubun üyesidir.");
        else
            System.out.println(kontrol +" bu grubun üyesi DEĞİLDİR.");'
         */

        Scanner scan = new Scanner(System.in);
        String grup[]= {"selen" , "umut" , "emrullah" , "umit", "umutcan"};



        for (int i = 0; i < grup.length ; i++) {
            System.out.print("ISIM GIRINIZ=");
           String isim = scan.nextLine();

            if((grup[i].equalsIgnoreCase(isim))) {

                System.out.println(isim+ "= bu kisi vardir.");
            }
            else

                System.out.println(isim + "= bu kisi yoktur!!!");
        }


    }
}
