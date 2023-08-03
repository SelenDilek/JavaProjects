package Gun35._02_Polymorphism;
//Superclass tan da nesne olustursak kendi ozelligini gostermesine polimorphism denir.

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabas");
        //kopek1.ses(); //Havladi yazacak
       // kopek1.kokladi(); //kokladi

        Kedi kedi1 = new Kedi("tekir");
      //  kedi1.ses(); //miyavladi
      //  kedi1.tirmaladi(); //tirmaladi

       // kopekSesi(kopek1); //havladi
       // kediSesi(kedi1); //miyavladi

        //kopekSesi(kedi1);

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

       //-__________________________________________________________________-//
        //Setlerden HashSet
        //Maplerden HashMap
        //Listlerden ArrayLsit

        //Hayvanlardan Kedi
        //Hayvanlardan Kopek
        //Hayvanlardan hayvan

        //Referansin TIPI     // NESNE nin tipi
        Hayvan hayvan1  = new Hayvan("ordek"); //hayvalardan 1 hayvan
        Hayvan hayvan2 = new Kopek("kangal"); //hayvalardan 1 kopek
        Hayvan hayvan3 = new Kedi("boncuk"); //hayvalardan 1 kedi


        System.out.println("------------------------------------------");
        hayvan1.ses(); //ses cikardi
        hayvan2.ses(); //havladi
        hayvan3.ses(); //miyavladi
        System.out.println("------------------------------------------");

        //ozellestirmek istersek:
        ( (Kopek)hayvan2 ).kokladi();



        //        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi





    }

    public static void hayvanSesi(Hayvan hayvan){

        hayvan.ses(); //nesneye bagli calisti gelen nesneye gore calisti.Sadece overriding kisminda kendisine donusuyor.
        //ama kendi orjinallerini gosteremediler h.kokladi gelemiyor bu yuzden :

        //bir classin aslinda kim oldugunu bulma yontemi
        if(hayvan instanceof Kopek) //hayvan aslinda kopek ise
            ((Kopek)hayvan).kokladi();

        if(hayvan instanceof Kedi) //hayvan aslinda kedi ise //gonderilen nesne Kedi turunde ise kedi turunde gelen nesne Kedinin nesne mi? evet ise
            ((Kedi)hayvan).tirmaladi(); // artik hayvan nesnesi Kedi lcass inin bir nesnedir ve Kedi class ina ait ozellikleri kullanabilir.
    }

    public static void kopekSesi(Kopek kopek){

        kopek.ses();
    }

    public static void kediSesi(Kedi kedi){

        kedi.ses();
    }
}
