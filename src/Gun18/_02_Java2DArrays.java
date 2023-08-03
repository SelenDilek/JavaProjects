package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[]dizi = new int[10]; //10 tnae bos halde , default 0
        int dizi2[] ={2,3,45,64,8,8,99,0,88,2};//10 tane hem tanimlandi hem deger atandi

        int [][] tablo = new int [2][3]; //2 satir 3 sutun hepsi default 0 degerine sahip


        int [][] tablo2 = { {2,3,44} , //1.satir 3elemanli
                            {45,66,5}  //2.satir  3elemanli
        }; //2 satir 3 sutun hepsi default 0 degerine sahip


            for(int satir=0 ; satir<2 ; satir++){ //0 , 1 NOT: stek bir for ile diziyi yazdirmak istersek :

                System.out.println(tablo2[satir][0] ); // her bir satirin 0. elemani
                System.out.println(tablo2[satir][1] ); // her bir satirin 1. elemani
                System.out.println(tablo2[satir][2] ); // her bir satirin 2. elemani
            }

        System.out.println();

        System.out.println( tablo2[0][0] );
        System.out.println( tablo2[0][1] );
        System.out.println( tablo2[0][2] );

        System.out.println( tablo2[1][0] );
        System.out.println( tablo2[1][1] );
        System.out.println( tablo2[1][2] );


        System.out.println();

        for(int satir=0 ; satir<2 ; satir++){ //0,1 //2satir
            for (int sutun = 0; sutun <3 ; sutun++) { //3 sutun

                System.out.print(tablo2[satir][sutun] +" ");
            }
                System.out.println();


        }


        System.out.println();

        for(int satir=0;satir<2;satir++){
            System.out.println( tablo2[satir][0] );
            System.out.println( tablo2[satir][1] );
            System.out.println( tablo2[satir][2] );
        }

        System.out.println();

        for(int satir=0;satir<2;satir++){

            for(int sutun=0;sutun<3;sutun++)
                System.out.print( tablo2[satir][sutun] + " " );
                System.out.println();

        }









    }
}
