package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız sayılarla dolduracağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
        // yazdırınız.

/*
        Scanner scannn = new Scanner(System.in);
        int dizii[] = new int[6];

       
        for (int i = 0; i < dizii.length ; i++) {
            System.out.print("Sayi giriniz =");
            dizii[i]=scannn.nextInt();
        }

        int lenght=0;

        for (int i = 0; i < dizii.length ; i++){

            if(dizii[i]%2==1)
            lenght ++;
}
  int array[] = new int[lenght];


        int index=0;

        for (int i = 0; i < dizii.length  ; i++)
            if(dizii[i]%2==1)
                array[index]= dizii[i];
                index++ ;

        ArrayList<Integer> list = new ArrayList<>() ;

        for (int j = 0; j <array.length; j++) {

            list.add(array[index]);
        }

        System.out.println("list = " + list);

*/
        //not : yeni bir diziye atamamiza gerek yok tekleri cunku zaten arraylist var elimizde boyuta onem vermiyor add,remove yapilir sonradan.

        Scanner scan = new Scanner(System.in);
        int dizi[] = new int[6];


        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Sayi giriniz =");
            dizi[i]=scan.nextInt();
        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler = new ArrayList<>();

        for (int i = 0; i < dizi.length ; i++) {
            if(dizi[i] % 2 !=0) // tek demek -1 ve 1 , hem pozitif hem negatif icin
                tekler.add(dizi[i]);
        }
        System.out.println("tekler = " + tekler);

        /************************************************************/

        tekler.clear();

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Sayi giriniz =");
            dizi[i] = scan.nextInt();

            if (dizi[i] % 2 != 0) // tek demek -1 ve 1 , hem pozitif hem negatif icin
                tekler.add(dizi[i]);

            System.out.println("tekler = " + tekler);


        }

    }
}
