package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        System.out.println("S\te\tl\te\tn");
        //BUNLARIN HEPSINE ESCAPECHARACTER DENIR.
        // \n -> yeni satir ac , alt satira gecer
        // \t -> tab tusuna bas, 2,3 harflik bosluk olustur
        // \b ->backspace etkisi olusturur,yani 1 karakter geri siler
        // \" -> tirnak yazdirmak icin kullanilir
        // \\ -> ekrana bir tane \ yazdirir
        // \r -> satir basina git

        System.out.println("MerhabaDunya"); //MerhabaDunya
        System.out.println("Merhaba\nDunya"); //Merhaba yazar , alt satira gecer Dunya yazar
        System.out.println("Merhaba\tDunya"); //Merhaba Dunya
        System.out.println("Merhaba\b\bDunya"); //MerhaDunya
        System.out.println("Merhaba\"Dunya"); //Merhaba"Dunya"
        System.out.println("Merhaba\\Dunya"); //Merhaba\Dunya
        System.out.println("Merhaba\rDunya"); //Dunya 08:12\r : 08:13 .. digital saatte kullanabiliriz




    }
}
