package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String [] isimler = {"Ahmet" , "Zeynep" , "Roman" , "Kaya" , "Cihan"};

        //ekrana for ile yazdiriyorduk ama
        //diziyi direk ekrana yazdirmak icin. (int , string ..)
        System.out.println("isimler = " + isimler); //isimler[i] nin degeri vardir isimler in bizzat degeri yoktur.
        System.out.println("isimler = " + Arrays.toString(isimler));

        int[] a = {1,8,3,54};
        System.out.println("a = " + Arrays.toString(a));

        //Diziler siralama

        Arrays.sort(isimler); //ilk sort ettik
        System.out.println("isimler = " + Arrays.toString(isimler)); //sonra yazdirdik //ascii tablosunda hangisi ilk ise
        //onu yazdiriyor once. A=65 a=97 Araba , araba 
        
        //Diziler Esit mi
        
        int[] b = {1,8,3,54};
        int[] c = {1,3,8,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true birebir ayni olmasina bakar.
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c)); //false
        
        //contains gibi calisir var ise pozitif sayi verir yok ise negatif
        //sadece sirali dizilerde calisir.
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3)); //a da 3 rakami var mi?
        //Arrays.binarySearch den once sort edip siralamak lazim.  - demek yok demek.


        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(c,3)); //c dizisi sirali !!!
        //1 cikti var demek pozitif anlamina gelir.!
        
        //Diziyi hizlica doldurmak icin 
        
        Arrays.fill(a,5); // a yi 5 ile doldur
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        
        
        

















    }
}
