package Gun27._02_Ornek;

public class SoruMain2 {
    public static void main(String[] args) {
        System.out.println(power(2,4));
        System.out.println(enBuyuk(2,5));
        System.out.println(enKucuk(2,5));
        System.out.println(Abs(-5));
        System.out.println(Cbrt(3));
        System.out.println(Sqrt(10));

    }

    public static int power(int sayi1 , int sayi2){
       int power=1;
        for (int i = 0; i <sayi2 ; i++) {
            power=power*sayi1;
        }

        return power;
    }

    public static int enBuyuk(int sayi1 , int sayi2){


        return sayi1>sayi2 ? sayi1 : sayi2 ;
    }
    public static int enKucuk(int sayi1 , int sayi2){


        return sayi1<sayi2 ? sayi1 : sayi2 ;
    }

    public static int Abs(int sayi1){

        if (sayi1 > 0)
            return sayi1;
        else if (sayi1==0) {
            return sayi1;

        } else
            return (-1) * sayi1 ;
    }

    public static int Cbrt(int sayi1){

        return sayi1*sayi1*sayi1 ;
    }

    public static int Sqrt(int sayi1){

        return sayi1*sayi1 ;
    }



}
