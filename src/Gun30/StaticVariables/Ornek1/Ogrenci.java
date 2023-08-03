package Gun30.StaticVariables.Ornek1;

public class Ogrenci {
    String ad ;
    String soyad ;
    static String okulAd= "Yildirim Ilkokulu" ; //kod adi: sen bitanesin
//hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar.
    // hepsine atanır, tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu



    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

        //this nesneyi kasdediyor.

    }



    @Override
    public String toString() {
        return "Ogrenci{" +
                "\nad='" + this.ad + '\'' +
                ", \nsoyad='" + this.soyad + '\'' +
                ", \nokulAd='" + okulAd + '\'' +
                '}';
    }
}
