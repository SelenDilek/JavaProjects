package Gun39._03_Soru;

public abstract class Hayvan {
    //final degiskenlericonstructerda atanir!!!
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    private static int sayac = 1; //static olmasaydi her zaman 1 den baslardi. bitane

    abstract void yiyecegi(); //sadece imzasi var

    abstract void yemekMiktari();

    abstract void gunlukUykuSuresi();

    abstract void sesi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=sayac++ ;
    }

    @Override
    public String toString() {

        //NOT toString in icindeki return e yazilamadigi icin bu sekilde yaptik
        System.out.println("ismi"+this.isim);
        System.out.print("yiyecegi"); yiyecegi();
        System.out.print("yemek mik"); yemekMiktari();
        System.out.print("uyku suresi"); sesi();
        System.out.print("sesi"); sesi();



        return
                "\nId=" + id +
                "\nIsim=" + isim  +
                "\nVahsi mi ? =" + vahsi +
                "\nDogum Tarihi=" + dogumTarihi ;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
