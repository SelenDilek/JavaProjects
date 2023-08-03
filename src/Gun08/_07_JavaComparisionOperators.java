package Gun08;

public class _07_JavaComparisionOperators {
    public static void main(String[] args) {

        //esit mi , farkli mi , buyuk mu , kucuk mu , buyukesit mi , kucuk esit mi

        int a = 50 ;
        int b=50 ;

        // = atama isareti , == esit mi ?

        boolean esitMi = (a==b); // a b ye esit mi
        System.out.println("esitMi = " + esitMi);

        System.out.println("a b ye esit mi = " + (a==b)); //true
        System.out.println("a b den farkli mi = " + (a!=b)); //false

        System.out.println("a b den buyuk mu  = " + (a > b)); //false
        System.out.println("a b den kucuk mu  = " + (a < b)); //false

        System.out.println("a ye buyuk esit mi  = " + (a >= b)); //true
        System.out.println("a ye kucuk esit mi  = " + (a <= b)); //true














    }
}
