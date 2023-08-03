package Gun35._01_Final.method;

public class AraclarMain {
    public static void main(String[] args) {
        Ucak g1 = new Ucak("737");
        g1.setKilometre();
        //final metholar cagrilir fakat ici degistirilemez.
        //final methodun bulundugu class extends edilebilir.
    }
}

//FINAL OZET

// degiskenlerin basinda oldugunda DEGERI sonradan degistirilemez.(deger bir kez atanir)
// methodlarin baslarinda oldugunda OVERRIDE edilemezler.
// class larin basina geldiginde EXTEND edilemez ama mainde nesne uretilir kendisinden.
