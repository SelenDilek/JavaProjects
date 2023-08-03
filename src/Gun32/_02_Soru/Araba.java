package Gun32._02_Soru;
//Encapsulation : hatayi engelleme
public class Araba {
    private String renk ; //private yazmak onemli //alt tusuna basili tutup dikey secim yapilir.
    private int model ;
    private int motorHacmi ;
    private int kapiSayisi;

    public Araba(String renk, int model, int motorHacmi, int kapiSayisi) {
        //this.renk = renk;
        //this.model = model;
        //this.motorHacmi = motorHacmi;
        //this.kapiSayisi = kapiSayisi;
        setRenk(renk); //hatali girisi engelledik
        setKapiSayisi(kapiSayisi);
        setMotorHacmi(motorHacmi);
        setModel(model);
    }

    public Araba() {
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {

        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if(kapiSayisi<7) //kapi sayisi 7ye kadar olan araclar var piyasada
        this.kapiSayisi = kapiSayisi;

        else
            System.out.println("Hatali giris");
    }
}
