package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {

        Cember c = new Cember();
        c.ciz(); //cember cizildi

        Dikdortgen d = new Dikdortgen();
        d.ciz(); //dikdortgen cizildi

        //interface lerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // çember çizildi
        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişeniirsin



       // ICizdirir c2 = new ICizdirir(); //sadece bu sablon ici bos ge set field constructer yok methodlarin ici bos

        //Interfaceden nesne uretilemez fakat ploymorphsm saglayabilir yani referans olusturulabilir.

      //sadece Icizdirir e ait ozellesmis methodlar kullanilir Cembere ozel methodlar kullanilmaz.



        cizdir(c); //Cember cizildi
        cizdir(d); //Dikdortgen cizildi


    }

    public static void cizdir(ICizdirir g){

        g.ciz();

    }
}




//OOP -
//Encapsulation
//Inheritance
//Interface
//----
//1 konu 1 gün konu 2 soru çözümü
//
//DateTime  1 gün
//Nesne,String  1 gün
//Hata yönetimi 1 gün
//
//Java bitiyor
//4 gün soru çözeceğiz
//4 gün kod yönetimi
//
//-- Testing tool