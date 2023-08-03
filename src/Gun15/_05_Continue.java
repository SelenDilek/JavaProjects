package Gun15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        Scanner oku = new Scanner(System.in);
        System.out.print("Ifade giriniz=");
        String cumle= oku.nextLine();

        //Bu gun hava cok guzel -> index=0 , kaca<cumle.lenght , 1er



        for(int i=0; i<cumle.length(); i++){


            if(cumle.charAt(i)== ' ')
                continue; //boslugu gormezden gel! //if in icindeki islemi yaptirmaz ama devam ettirir programi.

            System.out.println(cumle.charAt(i));



        }




    }
}
