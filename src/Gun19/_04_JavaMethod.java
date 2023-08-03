package Gun19;

public class _04_JavaMethod {
    //methodlarin yazilacagi yer






    public static void main(String[] args) { //ana method, diger metodlardan buranin icinden cagrilacak
        //calisan kisim main dir.

       int enb= Math.max(5,6); //max metodu deger/ler almis, geriye buyuk olani vermis
        double rndSayi=Math.random(); //hic bir sey almiyor , sadece veriyor

        System.out.println("Merhaba Dunya"); //veri aliyor, goturup ekrana yaziyor //ilk bu kisim calisir
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        //3 defa alt altta yazmak yerine
        merhabaYaz(); //Kullanimi kolay, tekrar tekrar kullanabilirsin
        merhabaYaz(); //mainin daha kolay anlasilanilir olur.Temiz kod mantigi icin.
        merhabaYaz(); //fonksiyonu cagirma sekli

    }

    //methodlarin yazilacagi yer
    public static void merhabaYaz(){

        System.out.println("Merhaba Dunya : metoddan");

    }


}
