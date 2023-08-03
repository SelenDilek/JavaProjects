package Gun29.SoruBenimCozumum;

public class Hesap {
    int yatan=0 ;
    int cekilen=0 ;
    private int bakiye=0 ;
     int bakiyeSonDurum=0;

    public void Yatirma(int yatirilan){


         this.bakiyeSonDurum= this.bakiye+yatirilan;

         this.yatan=this.yatan+yatirilan;
    }

    public void Cektirme(int cekme){

        this. cekilen=this.cekilen+cekme;
      this.bakiyeSonDurum= this.bakiyeSonDurum- cekme ;

    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
