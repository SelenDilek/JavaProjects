package Gun46;

public class S71 {
    public static void main(String[] args) {


        int [][] arr = new int[2][4] ;

        arr=new int[][]{

                {1,3,5,7}, //arr[0]
                {1,3}, //arr[1]
        };

        arr[0]= new int[]{1,3,5,7};
        arr[1]= new int[]{1,3};
        //arr nin elemanlari satirlardan tek boyutlu dizilerden olusuyor
        //arr.lenght nedir? //satir sayisini verir
        //a[i].lenght nedir? //satirdaki eleman sayisi

        for(int[] a : arr){ //a=1,3,5,7 -> a=1,3
            //int degil int[] yazdirilir cunku rakam degil dizi var.
            for(int i=0 ; i< arr.length;i++) { //arr.lenght satir

                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        ////////////////////////////////////////////////////////////////////////////////////
        //tablonun elemanlari dizi o yuzdne her elemanin kendi eleman sayisi var
        //tablo.lebght => satir sayisi yani 2
        //tablo[0].lenght => tablonun ilk elemanin eleman sayisi 4
        //tablo[1].lenght => tablonun ilk elemanin eleman sayisi 2


        //int[] dizi={1,2,3,4};
        //            0 1 2 3
        //tek boyutlu int dizi, kaç elemanı var ? 4
        //dizi.length : eleman sayısını verir
        //
        //
        //int[][] tablo=
        //   {
        //     {1,2,3,4},
        //     {45,66}
        //   };
        //
        //hemn en hem boy var yani 2 boyutlu
        //yani birden çok satır var, ve her satırda farklı
        //sayıda eleman olabiliyor.
        //
        //tablo 2 tane satırdan yani
        //2 tane tek boyutlu dizinin birleşiminden oluşmuştur
        //tablonun elemanları satırlardır.
        //tablonun kaç elemanı var 2 elemanı var
        //her elemanı dizi olduğu için
        //her satırın yani her elemanın da kendi eleman sayısı var
        //
        //tablo.length => satır sayısı yani 2
        //tablo[0].length => tablonun sıfırıncı elemanın eleman sayısı 4
        //tablo[1].length => tablonun birinci elemanın eleman sayısı 2
        //
        //
        //for(int[] dizi:  tablo) // tablonun elemanları gelecek yani tek boyutlu diziler
        //   for(int sayi : dizi)
        //     print(sayi);
        //
        //
        //for(int i=0; i< tablo.length;i++) // i: 0,1
        //  for(int j=0; j< tablo[i].length; j++)
        //    print( tablo[i][j])


    }
}
