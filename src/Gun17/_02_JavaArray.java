package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
// Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle giriniz =");
        String cumle = scan.nextLine();
        int boslukSayisi=0;

        //tum cumledeki bosluk sayisini bulup artir
        for(int i=0 ; i<cumle.length() ; i++){
            if (cumle.charAt(i) == ' '){

                boslukSayisi++;
            }


        }

        System.out.println("Cumledeki kelime sayisi = " + (boslukSayisi+1));








    }
}
