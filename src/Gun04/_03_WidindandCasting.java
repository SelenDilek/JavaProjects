package Gun04;

public class _03_WidindandCasting {
    public static void main(String[] args) {
        // *********************  1. küçük alanı -> büyüğe atılabiliyor (genişleme-Widening casting) ************************
        // byte-> short-> int-> long-> float-> double
        // veri kaybı kesinlikle yok
        //kucuk alan buyuge rahatlikla atabiliriz yeri cok cunku.
        int sayi = 9 ;
        long toplam = 6700 ;
        double oran = 3.2 ;

        oran=sayi ; //int-> double genis hafizaya atiliyor.
        System.out.println("oran = " + oran); //veri kaybi yok 9.0

        toplam=sayi ; // int -> long
        System.out.println("toplam = " + toplam); // veri kaybi yok 9

        oran=toplam ; // long -> double
        System.out.println("oran = " + oran);// veri kaybi yok 9




    }
}
