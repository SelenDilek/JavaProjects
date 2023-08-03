package Gun07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase :stringi kucuk harfe cevirir.

        String text = "Merhaba Dunya";
        System.out.println("orjinal hali=" + text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        boolean basliyorMu=text.startsWith("M") ; //true
        boolean basliyorMu2=text.startsWith("m") ; //false
        boolean basliyorMu3=text.startsWith("m") ; //false
        boolean basliyorMuIgnoreCase=text.toLowerCase().startsWith("m") ;

        System.out.println("basliyorMu = " + basliyorMu);
        System.out.println("basliyorMu2 = " + basliyorMu2);
        System.out.println("basliyorMuIgnoreCase = " + basliyorMuIgnoreCase);



    }
}
