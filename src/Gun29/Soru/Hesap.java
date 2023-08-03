package Gun29.Soru;

public class Hesap {

    private int yatan ;
    private int cekilen;
    private int bakiye;



    public  void paraYatir(int yatanPara){
        this.yatan = this.yatan + yatanPara ;

        this.bakiye = this.bakiye + yatanPara;

    }

    public  void paraCek(int cekilenPara){

        this.cekilen = this.cekilen + cekilenPara; //toplam cekilen para
        this.bakiye = this.bakiye - cekilenPara;

    }


    @Override
    public String toString() {
        return "Hesap{" +
                "Toplam yatan=" + this.yatan +
                ", Toplam cekilen=" + this.cekilen +
                ", Bakiye=" + this.bakiye +
                '}';
    }
}
