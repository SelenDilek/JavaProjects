package Gun06;

public class _04_StringCharAt {
    public static void main(String[] args) {
        //charAt : istenilen noktadaki karakteri verir.
        // bugun
        //                        111
        //              0123456789012
        String cumle = "Merhaba Dunya"; //uzunluk=13 0-12 ye kadardir. 0 i da sayar. 0dan baslar. 0-12 index
        System.out.println("uzunluk="+cumle.length());

        cumle.charAt(0); //o daki karakteri var.
        char ilkHarf = cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        //char harf= 'a'; ile String harf="a" ; ayni degil biri harf alir digeri cumle alir.

        //char bir oda string ise bir kat



    }
}
