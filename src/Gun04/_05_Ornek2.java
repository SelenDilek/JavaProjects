package Gun04;

public class _05_Ornek2 {
    public static void main(String[] args) {
        
        int bolunen = 10 ;
        int bolen = 3 ;
        int sonuc = bolunen / bolen ; //sonuc tam sayi cikar
        System.out.println("sonuc = " + sonuc);
        double sonucc = bolunen / bolen ; // int/int = int tir.
        System.out.println("sonuc = " + sonuc); // cevap 3 cikti yani tam sayinin (int) tam sayiya(int) bolumu tam sayidir.

        double sonuccc = bolunen / (double) bolen; //birine double yazmamiz yeterli
        System.out.println("sonuccc = " + sonuccc);













    }
}
