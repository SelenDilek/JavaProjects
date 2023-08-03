package Gun18;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        /*int dizi[][]= new int [2][3];
        int sayi=0;


        for (int satir = 0; satir < dizi.length ; satir++) {
            for (int sutun = 0; sutun <dizi[satir].length ; sutun++) {

                int random =(int) (Math.random()*100) ;

                dizi[satir][sutun]=random;

            }
        }

        for (int satir = 0; satir < dizi.length ; satir++) {
            for (int sutun = 0; sutun < dizi[satir].length; sutun++) {

                System.out.print(dizi[satir][sutun] + " "); }

                


                if(dizi[satir][sutun] %2 == 1){

                    sayi++;
                }
               


            }

        }  System.out.println(sayi + "tane tek sayi vardir.");
        
        */

        int tablo[][]= new int [2][3];

        for (int satir = 0; satir < tablo.length ; satir++) {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++) {

                tablo[satir][sutun]=(int) (Math.random()*100) ;

            }
        }

        for (int satir = 0; satir < tablo.length ; satir++) {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++) {

                System.out.print(tablo[satir][sutun] +" ");

            }
                System.out.println();

        }

        int tekSayiMik=0;
        boolean tekMi =false;
        
        for (int satir = 0; satir < tablo.length ; satir++) {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++) {

                if(tablo[satir][sutun]%2 ==1){
                    tekMi=true;
                    
                    tekSayiMik++ ;
                }

            }
        }
        System.out.println("tekSayiMik = " + tekSayiMik);

        if(tekMi==true)
            System.out.println("Tek sayi vardir ve miktari = " + tekSayiMik);

        else
            System.out.println("Tek sayi yoktur.");
        
        //NOT :

        /*
        nt[] notlar=new int[50];


int[] notlarDers1=new int[50]; 3x50
int[] notlarDers2=new int[50];
int[] notlarDers3=new int[50];

notlarDers1[0]; 0.öğr Kimya Notu
notlarDers2[0]; 0.öğr Mat Notu
notlarDers3[0]; 0.öğr Fiz Notu

int[][] tumNotlar=new int[3][50];

tumNotlar[0][0]  0.öğr Kimya Notu
tumNotlar[1][0]  0.öğr Mat Notu
tumNotlar[2][0]  0.öğr Fiz Notu

int[][] notlar=new int[2][3];
// 2 satır her satır 3 not var : 6 not

print( notlar[0][0] );
print( notlar[0][1] );
print( notlar[0][2] );

print( notlar[1][0] );
print( notlar[1][1] );
print( notlar[1][2] );

for(int i=0;i<2;i++){ // 0,1

  print( notlar[i][0] );
  print( notlar[i][1] );
  print( notlar[i][2] );

}


for(i=0;i< notlar.length ;i++){ // 0,1

   for(j=0;j< notlar[i].length;j++) // 0,1,2
     print( notlar[i][j] );

}

notlar.length : kaç satır sa o rakam
         */
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
