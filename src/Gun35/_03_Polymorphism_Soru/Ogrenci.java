package Gun35._03_Polymorphism_Soru;

public class Ogrenci extends Kisi {

    private String sube ;

    public Ogrenci(String ad, String soyAd, String gorevi,String sube) {
        super(ad, soyAd, gorevi);
        setSube(sube);
    }



    @Override
    public String toString() {
        return super.toString() +"\nSubeniz= " + this.sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
