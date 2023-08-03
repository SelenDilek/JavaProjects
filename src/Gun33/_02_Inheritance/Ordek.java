package Gun33._02_Inheritance;

//inheritance yaparken encapsulation da yapiyoruz.
public class Ordek extends Hayvan{

    private double kanatAcikligi;
    public Ordek(String renk, double kilo, String cinsi, double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }


    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Vikvik");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", kanat aciligi=  " + this.kanatAcikligi;
        //return getRenk() + getCinsi() + this.kanatAcikligi; Bu sekilde de yapilabilir.
    }

    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
