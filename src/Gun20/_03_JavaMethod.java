package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
// Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayi=");
        int sayi1=oku.nextInt();
        System.out.print("2.Sayi=");
        int sayi2=oku.nextInt();


        int enb=enbBul(sayi1,sayi2);
        System.out.println("En buyuk sayi = " + enb);

        //Tools Paketi icinden fonksiyon cagirdik.
        enb= MyFunc.enbBul(sayi1,sayi2);
        System.out.println("Tools paketinde bulunan MyFunc classinin alt classi olan enbBul'dan urettigim enb =" + enb);

        int random=MyFunc.rndTamSayi(10);
        System.out.println("Tools paketinden uretilen random = " + random);

    }

    public  static  int enbBul(int s1 , int s2){ //methodunimzasi //1.yol

        int enb=0;
        if(s1>s2)
            enb=s1;
        else
            enb=s2;


        return  enb;
    }

    //NOT : BU SEKILDE DE YAPABILIRIZ !!
    //if()
    //return s1;
    //else
    //return s2;




  /*  public  static  int enbBul(int s1 , int s2){ //methodun imzasi //2.yol (iki methodun adi ayni o yuzden ayni anda calismaz yorum satirina aldik.)

        return (s1>s2 ? s1:s2);
    }


*/


}
