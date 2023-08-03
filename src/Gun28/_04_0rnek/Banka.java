package Gun28._04_0rnek;

public class Banka {
    String  bankaAdi ;
    int subeSayisi ;
    int kurulusYili ;

    public Banka() {
        System.out.println("BANKA BILGILERI : ");
    }

    public Banka(String bankaAdi, int subeSayisi, int kurulusYili) {

        System.out.println("BANKA ADI SUBE SAYISI VE KURULUS YILI : ");
        this.bankaAdi = bankaAdi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String bankaAdi, int kurulusYili) {


       this(bankaAdi,kurulusYili,0);
    }

    public Banka(String bankaAdi) {
        this(bankaAdi,0,0);
    }


    @Override
    public String toString() {
        return "Banka{" +
                "bankaAdi='" + bankaAdi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
