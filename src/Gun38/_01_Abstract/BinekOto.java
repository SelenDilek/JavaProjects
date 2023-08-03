package Gun38._01_Abstract;

public abstract class BinekOto {
    private  String marka ;
    private  int uretimYili;
    private int vitesAdi;
    abstract int hizlanmaSuresi();


    public BinekOto(String marka, int uretimYili, int vitesAdi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdi(vitesAdi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdi() {
        return vitesAdi;
    }

    public void setVitesAdi(int vitesAdi) {
        this.vitesAdi = vitesAdi;
    }
}
