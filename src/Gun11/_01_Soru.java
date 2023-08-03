package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

        // yan yana aralarinda bir bosluk girilen 2 int sayinin birbirine esit olup olmadigini bulunuz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen sayilari bir bosluk ile giriniz=");
        String kelime = scan.nextLine();
        
        int bosluk1 = kelime.indexOf(" ");

        
        String sayi1 = kelime.substring(0,bosluk1);
        String sayi2 = kelime.substring(bosluk1+1);
        
        int sayiBir = Integer.parseInt(sayi1);
        int sayiIki = Integer.parseInt(sayi2);

        System.out.println("sayiBir = " + sayiBir);
        System.out.println("sayiIki = " + sayiIki);
        
        if(sayiBir==sayiIki)
            System.out.println("Sayilar birbirine esittir");
        else
            System.out.println("Sayilar birbirine esit degildir" );
        
        
        
        




    }
}
