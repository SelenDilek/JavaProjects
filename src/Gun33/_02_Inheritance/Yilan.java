package Gun33._02_Inheritance;

public class Yilan extends Hayvan{

    private int uzunluk;

    public Yilan(String renk, double kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);

    }

    @Override
    public void konustu() {

        System.out.println("Tisladi");
    }

    @Override
    public String toString() {
        return super.toString() +" , uzunluk " + this.uzunluk;

        //return super.getCinsi() + " " + this.uzunluk;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
