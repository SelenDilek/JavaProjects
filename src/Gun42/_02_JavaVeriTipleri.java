package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        //ilkel tip , primitive tip : short , byte,long, double,boolean
        
        int sayi1=5;
        int sayi2=12;


        sayi1=sayi2; // sayi1=12 , sayi22nin degeri alindi ve sayi1 e verildi //sadece degerler esitlendi
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //Referans tipler: class,diziler,arrayler ,nesneler (adi ve degeri farkli yerlerde)
        //ismi ayri degeri ayri tutuluyor
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};

        System.out.println("dizi1 = "+Arrays.toString(dizi1)); //1,2,3,4
        System.out.println("dizi12 = "+Arrays.toString(dizi2)); //5,6

        dizi1=dizi2; //yerini silip diger degere esitliyor bellekte //refernaslar esitlendi


        System.out.println("dizi1 = "+Arrays.toString(dizi1)); //5,6
        System.out.println("dizi12 = "+Arrays.toString(dizi2));  //5,6

        dizi1[0]=67;

        //birisinde yaptigim degisiklik ikisi de ayni yeri gosterdigi icin aynisini yazar
        //kopyasini almadi

        System.out.println("dizi1 = "+Arrays.toString(dizi1)); //67,6
        System.out.println("dizi12 = "+Arrays.toString(dizi2));  //67,6


        dizi2[0]=55;

        System.out.println("dizi1 = "+Arrays.toString(dizi1)); //55,6
        System.out.println("dizi12 = "+Arrays.toString(dizi2));  //55,6
        
        //kopyalamadigi icin bellekten tasarruf ediyor. Bunun ismi ayni yeri gostersin diyor.
        
        
        //Nesne Tipler : NULL alanilen ilkel tip
        //String , Double , Long , Integer
        
        //Stringler null alabilen ilkel tiplerdir.
        String ad1 ="mehmet";
        String ad2 ="ismet";
        
        ad1=ad2;
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);
        
        ad1="ali";

        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);
        
        ad2="zeynep";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);


    }
}
