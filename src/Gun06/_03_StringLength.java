package Gun06;

public class _03_StringLength {
    public static void main(String[] args) {
        //String kelime veya cumle olabilir.
        //StringLength -> bir Stringin uzunlugunu verir (kac harf var) bosluklar da karakter.
        //mesela int yerine double da kabul eder cunku casting yapiyor ama byte short kabul etmez.


        String cumle = "Bu gun hava cok guzel";
        int uzunluk=cumle.length();
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + cumle.length());






    }


}
