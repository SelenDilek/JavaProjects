package Gun33._03_Soru;

public class GenelMudur extends Calisan {

    private double tazminat;
    public GenelMudur(String isim, double maas, double maasKatsayisi , double tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        //eger kademesi ise tazminatin yarisini alir.
        if(tazminat>0)
        this.tazminat = tazminat;
    }


   // @Override
    //public String toString() {
   //     return super.toString() + " " +"\nTazminatiniz  =  " + this.tazminat;
   // }

    public  String toString(){

      return   "Bordro"+
                "\nIsiminiz ='" + super.getIsim()+ '\'' +
                ", \nMaasiniz =" + super.getMaas() +
                ", \nMaas katsayisiniz=" + super.getMaasKatsayisi()+
                "\nOdenecek Maas=" + maasHesapla()+
                 "\nTazminatiniz  =  " + this.tazminat;

    }
}
