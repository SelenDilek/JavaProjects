package Gun34._04_Protected._Paket2;

import Gun34._04_Protected._Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad , String cinsi){

        super.ad=ad; //public
        super.cinsi=cinsi; //protected

        //defaulttan farkli olarak
        //extend edildiginde diger paketlerden de erisilebilir.
    }


}
