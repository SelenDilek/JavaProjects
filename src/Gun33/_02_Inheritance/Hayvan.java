package Gun33._02_Inheritance;
//her zaman private yapmalisin..
public class Hayvan { //super , parent ,base class
   private String renk ;
   private double kilo ;
   private String cinsi ;

    public Hayvan(String renk, double kilo, String cinsi) {
        setCinsi(cinsi);
        setKilo(kilo);
        setRenk(renk);
    }




    public void konustu(){

        System.out.println("Ses cikardi");
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
