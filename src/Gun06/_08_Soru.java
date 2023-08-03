package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //Girilen bir ad soyadi ornegin "Selen Dilek" S.D. seklinde yazdir.
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Ad ve soyad = ");
        String aDveSoyad= okuyucu.nextLine();


        char ilkHarf = aDveSoyad.charAt(0);


        int boslukIndex = aDveSoyad.indexOf(" ");
        char soyadIlkHarf = aDveSoyad.charAt(boslukIndex+1);

        System.out.println(aDveSoyad+ "->" + ilkHarf +"."+ soyadIlkHarf+"." );



    }
}
