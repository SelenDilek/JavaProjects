package Gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {
        //        A   hava    A  bilgisayar için her şey sayı
//        A->65
//        a->97
        //karakter ve karsilik gekeb sayilarin yer aldigi tablo var
        // A -> 65 -- 65 sakliyor
        // 65 -> A -- A sakliyor.
        //a ile A arasi +32dir.
        //ASCII tablosu

        int sayi = 65 ;
        System.out.println("sayi = " + sayi);

        char harf = (char)65;
        System.out.println("harf = " + harf);

        //ascii tablosu
        for (int i = 0; i <=255; i++) {

            harf=(char) i ;
            System.out.println(i + "nolu harf = " + harf);

        }










    }
}
