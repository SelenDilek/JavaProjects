package Gun29.SoruBenimCozumum;

public class Banka {
    public static void main(String[] args) {
        
        Musteri musteri1 = new Musteri("Selen" , "Dilek");
        musteri1.MusteriHesap.Yatirma(100);
        musteri1.MusteriHesap.Yatirma(200);
        musteri1.MusteriHesap.Cektirme(50);



        System.out.println("Sayin , " + musteri1.ad + " " + musteri1.soyad);
        System.out.println("********************************************");
        System.out.println("--Bakiye durumunuz--");
        System.out.println("Yatirilan para tutariniz = " + musteri1.MusteriHesap.yatan);
        System.out.println("Cekilen para tutariniz = " + musteri1.MusteriHesap.cekilen);
        System.out.println("Kalan Bakiye = " + musteri1.MusteriHesap.bakiyeSonDurum);
        System.out.println("Guncel Hesap Bilgileriniz : ");
        System.out.println(musteri1);
        

        
        
    }
}
