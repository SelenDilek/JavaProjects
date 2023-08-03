package Gun27._01_Ornek;

public class JavaStaticveNonStatocMetodlar {

    //main de static yani canli hazir olusturulmaya muhtac degil.
    public static void main(String[] args) {


        Utility.getString2(56);


        //bazi methodlar nesneye ihtiyac duyar ve nesne olmadan calisamaz.Nesne nin ozelliklerleri olmadan kullanilma ozelligi yoksa nonstatic.
        Utility  ut = new Utility(); //ut : nesne
        ut.getString(56);
        //anca nesne olusturursam bu gelir.


        //STATIC METHODLAR  : class a yani tipe aittir.
        //STATIC OLMAYANLAR : nesne ye aittir.

        //STATIC BAGIMSIZ CALISIR NESNELERI ICERMEZ !

        Math.random(); //Math class random method , random static kullanisli hizli.Direkt kullanilir.

    }
}
