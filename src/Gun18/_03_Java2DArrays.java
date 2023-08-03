package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {

       int [][] tablo ={ //2 satir, 3 sutun new[2][3]
               {2,3,44}, // 1.satir 3 elemanli
               {45,66,5}, // 2.satir 3 elemanli
       } ;

        System.out.println(Arrays.toString(tablo[0])); //0.satir tumu
        System.out.println(Arrays.toString(tablo[1])); //1.satir tumu
        System.out.println("tablo[0].lenght = "+ tablo[0].length); //0. satirin uzunlugu
        System.out.println("tablo[0].lenght = "+ tablo[1].length); //1. satirin uzunlugu

        System.out.println("tablo = " + tablo.length); //kac satir var , satir uzunlugu

        System.out.println(Arrays.toString(tablo[0]));
        System.out.println(Arrays.toString(tablo[1]));


        for(int satir=0 ; satir<tablo.length ; satir++){ //0,1 //2satir
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++) { //3 sutun //her bir satirin sutunlarini yazdiran for

                System.out.print(tablo[satir][sutun] +" ");
            }
            System.out.println();


        }





    }
}
