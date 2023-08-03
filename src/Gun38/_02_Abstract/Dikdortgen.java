package Gun38._02_Abstract;

public class Dikdortgen extends  Sekil {

    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    double Alan() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    double Cevre() {
        return 2*(this.uzunKenar+this.kisaKenar);
    }
}
