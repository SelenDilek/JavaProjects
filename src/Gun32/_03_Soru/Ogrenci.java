package Gun32._03_Soru;

public class Ogrenci {

    private int okulNo; //essiz ogrenci ID si icin
    private static int sayacID=1;
    private String ad ;
    private String soyad ;
    private int yas ;


    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setYas(yas);
        setSoyad(soyad);
        this.okulNo =sayacID++;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + this.okulNo +
                ", ad='" + this.ad + '\'' +
                ", soyad='" + this.soyad + '\'' +
                ", yas=" + this.yas +
                '}';
    }
}
