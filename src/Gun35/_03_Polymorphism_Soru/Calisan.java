package Gun35._03_Polymorphism_Soru;

public class Calisan extends Kisi {

    private String depertman;

    public Calisan(String ad, String soyAd, String gorevi,String depertman) {
        super(ad, soyAd, gorevi);
        setDepertman(depertman);
    }

    @Override
    public String toString() {
        return super.toString() +"\nDepartmaniniz= " + depertman;
    }

    public String getDepertman() {
        return depertman;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }
}
