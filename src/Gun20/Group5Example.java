package Gun20;

import java.util.Arrays;

public class Group5Example {
    public static void main(String[] args) {
        // bir tane dizi tanımla
        // diziyi random sayılarla doldur
        // pozitif olanları metotdan al
        // hepsini ekrana mainde yazdır
        int[] dizi = new int[3];

       int dizi1[] = diziDoldur(dizi, 10);

        System.out.println("dizi = " + Arrays.toString(dizi1));

        int[] tekSayilar = tekSayiBul(dizi);

        System.out.println("tekSayilar = " + Arrays.toString(tekSayilar));

    }

    public static int[] diziDoldur(int[] dizi, int sinir) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * sinir);
        }

        return dizi;
    }

    public static int[] tekSayiBul(int[] dizi) {
        int tekSayiMik = 0;


        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] % 2 == 1){
                tekSayiMik++;
        }
         else if (dizi[i] % 2 == 0 )
            continue;




        int tekSayiIndex=0;
        int[] tekSayilar = new int[tekSayiMik];


        for (int i = 0; i < 3; i++) {
            if (dizi[i] % 2 == 1 ){
                tekSayilar[tekSayiIndex] = dizi[i];
                tekSayiIndex++;}

            else if(dizi[i] % 2 == 0 )
                continue;



        }


        // i = 1
        return tekSayilar;
    }



}
