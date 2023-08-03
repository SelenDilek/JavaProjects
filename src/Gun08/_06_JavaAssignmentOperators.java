package Gun08;

public class _06_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a = 10 ; // a ya 10 degeri atanir

        a=5 ; // a ya 5 degeri atanmis olur.

        a=a+6 ; //a ya 6 degerini ekle sonuc =11 oldu.

        a+=6 ; // a ya 6 degerini ekle demek. sonuc = 17 oldu // a nin artis degeri 6 ya esit

        a++ ; // a yi bir attir demek.

        ++a ; // bu da ayi bir artir demek

        a+=1 ; // a yi bir artir.

        a=a-1 ; //a yi bir azalt demek
        a-- ; // a yi bir azalt demek
        --a ; // a yi bir azalt demek
        a-=1 ; // a yi bir azalt demek
        a-=25 ; // a yi 25 azalt demek

        /*****************************************************/
        int b = 10 ;
        b=b/5 ; //b yi 5e bol demek
        b/=5 ; //b yi 5 e bol demek
        System.out.println("b = " + b);

        /***************************************************/

        int c = 10 ;
        c=c*5 ; // c yi 5 ile carp 50
        c*=5 ; // c yi 5 ile carp 50
        System.out.println("c = " + c);

        String yeniDeger =String.valueOf(c);
        System.out.println("INTEGER TO STRING : " +yeniDeger);








    }
}
