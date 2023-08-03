package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        
        // (int)(Math.random()*10) -> 0-9 arasi uretir. 0 dan baslar.
        // 20-30 arasi random sayi ? min ve max lazim. Alt sinir ve ust sinir
        //Girilen min ve max araliginda random say ureten programi yaziniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("min (alt sinir) = ");
        int min = oku.nextInt();
        System.out.print("max (ust sinir) = ");
        int max = oku.nextInt();
        
        //20-30 -> aralik : 10
        //once 0-10 uret;
        //sonra buna min ekle.
        
        int rndSayi = (int) (Math.random()*(max-min)) + min ;

        System.out.println("rndSayi = " + rndSayi);
        
    }
}
