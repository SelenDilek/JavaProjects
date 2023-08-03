package Gun08;

public class _04_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a = 9;
        int b =5;

        System.out.println("Toplama islemi");
        System.out.println("a+b sonucu = " + (a+b));

        System.out.println("Cikartma islemi");
        System.out.println("a-b sonucu= "+ (a-b));

        System.out.println("Carpma islemi");
        System.out.println("axb sonucu= " + (a*b));

        System.out.println("Bolme islemi");
        System.out.println("a/b sonucu= " + (a/b));
        //normal sonuc 1.8 cikmasi lazim. Fakat bilgisayar ikisi de tam sayi tipinde ise kusurati atar.
        //bu sebeple sonuc 1 olur. Yuvarlama yapmaz ne ise atar. int/int=int
        //kusuratli , ondalikli sonuc istiyorsam isleme girenlerden en az birisi double olmali.

        System.out.println("a/b sonucu= " + ((double)a/b));

        /************************************************************/
        //modulu mesela sayi tek mi cift mi? sayi%2 1se tek , 0 sa cifttir.
        //10%3 -> 1 , 10001%2-> 1 , 9%3 -> 0
        //29%10  -> 9

        System.out.print("Modul islemi: bolumunden kalan demek");
        System.out.println("a%b = " + (a%b)); //4

        System.out.println("b%a = " + (b%a)); //bolunemedigi icin bolunemeyeni alir. //5

        //145 den 4 u elde etme : 145/10 -> 14 kalir kusuratu atar , 14%10 -> 4 kalir elimde.














    }
}
