package Gun34._03_Soru;

public class IlkOgrencisi extends Ogrenci {
    private String klup;

    private static int ilkSayacID=1;
    public IlkOgrencisi(String isim, String klup) {
        super(isim, OgrTip.ILK, ilkSayacID++);
        setKlup(klup);
    }

    @Override
    public String toString() {
        return super.toString()+", klup="+this.klup;
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }


}
