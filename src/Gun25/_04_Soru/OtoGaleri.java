package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoGaleri {
    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        ArrayList<Araba> galeri = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Araba a = new Araba();

            System.out.print("Araba No=");
            a.arabaNo=okuInt.nextInt();
            System.out.print("Araba Markasi=");
            a.marka=okuStr.nextLine();
            System.out.print("Araba Uretim Yili=");
            a.uretimYili=okuInt.nextInt();
            
            galeri.add(a);
            
        }
        
        arabalarYazdir(galeri);
        uretimOrtalamaYazdir2(galeri);
       int ort = uretimOrtalamaYazdir(galeri);
        System.out.println("ort = " + ort);

        
    }

    public static int uretimOrtalamaYazdir(ArrayList<Araba> galeri){
        int toplam = 0 ;
        for(Araba a : galeri)

            toplam=toplam+a.uretimYili;


        int ortalama= toplam / galeri.size();

        return  ortalama;




    }
    
    
    public static void arabalarYazdir( ArrayList<Araba> galeri){
        
        for(Araba a : galeri){

            System.out.println("Araba no= " + a.arabaNo + "Uretim Yili= " +  a.uretimYili +"Marka= " + a.marka);
        }
        
        
    }
    
    public static void uretimOrtalamaYazdir2(ArrayList<Araba> galeri){
        int toplam = 0 ;
        for(Araba a : galeri)
            
            toplam=toplam+a.uretimYili;
            
         
        int ortalama= toplam / galeri.size();

        System.out.println("ortalama = " + ortalama);
        
        
        
        
    }
    
    
}
