package Gun34._03_Soru;

public class LiseOgrencisi extends Ogrenci {
    private String brans;

    private static int liseSayacID=1;
    public LiseOgrencisi(String isim, String brans) { //buraya yazarsak nesne urettigimiz zaman olusturmak zorundayiz.
        super(isim, OgrTip.LISE, liseSayacID++); //ogrtipi Lise olmasi ve sayacin tek olmasi direkt atamamiza imkan verir cunku degerleri tek.
        //Lise ogrencisi icin Lise olmak zorunda , id de tek olmak zorunda. Bu kisma yazarsak nesne olustururken otomatik gelecek.
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+", branş="+this.brans;
    }
}
