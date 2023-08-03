package Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //2x3 luk bir tabloyu randim 10a kadar  sayilar ile doldurunuz.
        //Daha sonra kullanicidan bir sayi aliniz.Bu sayi tabloda var ise
        //yerine(satir,sutun ) yazidiriniz.
        
        int tablo [][] = new int[2][3];


        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0;  j <tablo[i].length ;  j++) {
                
                tablo[i][ j]= (int) (Math.random()*10) ;
                
            }
            
        }

        for (int i = 0; i < tablo.length ; i++) {
            for (int  j = 0;  j <tablo[i].length ;  j++)

                System.out.print(tablo[i][ j] +" ");
            System.out.println();



        }
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int arananSayi= oku.nextInt();
        System.out.println("sayi = " + arananSayi);

        boolean sayiVarMi = false;
        for (int i = 0; i < tablo.length ; i++) {
            for (int  j = 0;  j <tablo[i].length ;  j++) {

                if(arananSayi==tablo[i][ j]) {
                    System.out.println("satir = " + (i) + " " + "sutun= " + ( j));
                    sayiVarMi=true;

                }

            }



        }

        if(sayiVarMi==true){
            System.out.println("Sayi var");
        }
        else
            System.out.println("Sayi yok");
        
        
        
        
    }
}
