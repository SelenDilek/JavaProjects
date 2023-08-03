package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        //nested array , bir hucreye liste gondereceksek. ArrayList<Integer> yaziyorduk yani icine bir deger int turunde demek.
        //Array in hucrelerine liste atama 2D oluyor.her hucrede bir liste var.

        int sayi=5 ; // tek bir rakam saklayabilen bir degisken
        int [] dizi=new int[20] ; // 20 adet sayi saklayabilen bir degisken, uzunluk sabit,her bir hucresinde bir sayi var.

        int[][] tablo = new int[20][10]; //20 satir 10 sutun var, 200 sayi saklar
                                        //uzunluk sabit, her hucrede bir dizi var
                                        //her bir satirda 10 sayi olan bir dizi var.

        ArrayList<Integer> liste = new ArrayList<>(); // her bir satir(hucresi) integer bir sayi saklayabilecek,attildikkca
                                                      //Integer in listi , uzunluk degisken


        ArrayList<Integer> matNotlari = new ArrayList<>(); //bu tek boyutlu
        ArrayList<Integer> fizikNotlari = new ArrayList<>(); // tek boyutlu
        ArrayList<Integer> kimNotlari = new ArrayList<>(); // tek boyutlu

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(50);
        fizikNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //Acaba bu notlari tek bir degiskene nasil atarim?
        /******************************/
        //ArrayList lerin ArrayList i :

        ArrayList<ArrayList<Integer>>  tumNotlar = new ArrayList<>();
        tumNotlar.add(matNotlari);
        tumNotlar.add(fizikNotlari);
        tumNotlar.add(kimNotlari);
        //tum satirinda mat , fizik , kimya notlari var.

        tumNotlar.get(0); //matNotlari  (hepsini)
        tumNotlar.get(0).get(0); //ilk mat notu
        System.out.println("tumNotlar.get(0) = " + tumNotlar.get(0)); //matNotlari
        System.out.println("tumNotlar.get(0) = " + tumNotlar.get(1)); //fizikNotlari
        System.out.println("tumNotlar.get(0) = " + tumNotlar.get(2)); //kimyaNotlari

        System.out.println("tumNotlar.get(0).get(0) = " + tumNotlar.get(0).get(0));


        //for ile yazdirmak istiyorum.


        //***********************satir yazdirma*************************//

        for (int i = 0; i <tumNotlar.size() ; i++) {

            System.out.println("tumNotlar = " + tumNotlar.get(i)); //tum satirdaki derslere ait notlari verir. her dersin notlarini.

        }

        //***********************satir yazdirma*************************//

        for (int i = 0; i <tumNotlar.size() ; i++) {
            for (int j = 0; j <tumNotlar.get(i).size() ; j++) {
                System.out.println("tumNotlar = " + tumNotlar.get(i).get(j)); //her bir sutun icinde bulunan tek tek notlari verir.
            }


        }




    }
}
