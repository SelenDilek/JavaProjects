package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        ArrayList<Vehicle> araclar = new ArrayList<>();

        Vehicle teslaCar = new TeslaCar(310 , "model 5");
        araclar.add(teslaCar);

        Vehicle pirus = new ToyotoPirus(1200,"Sedan");
        araclar.add(pirus);

        Vehicle bus = new cityBus(7000,"IVECO");
        araclar.add(bus);


        for(Vehicle v : araclar){

            System.out.println("------------------------");
            System.out.println(v.getClass().getSimpleName()); //Class adini yazar
            System.out.println("-------------------------");

            System.out.println(v.getModel());
            System.out.println(v.getEngine());

            if( v instanceof TeslaCar) {
                System.out.println(((TeslaCar) v).drive());
               // System.out.println(v.toString());
                System.out.println(((TeslaCar) v).changeBattery());

            }

            else if( v instanceof ToyotoPirus) {
                System.out.println(((ToyotoPirus) v).drive());
                //System.out.println(v.toString());
                System.out.println( ((ToyotoPirus) v).changeBattery());
                System.out.println(((ToyotoPirus) v).changeOil());

            }

            else {
                System.out.println( ((cityBus) v).drive());
               //System.out.println(v.toString());
                System.out.println(((cityBus) v).changeDiesel());

            }


        }


//NOT
        //INHERITANCE : CLASSLARINORTAK KISIMLARININ YAZILDIGI YER (VEHICLE)

        //CLASSLARDAKI ORTAK METODLARIN SADECE IMZASININ YAZILDIGI YER , MWTODLARIN ZORUNLU OLARAK YAZDIRILDIGI YER.
        //yapilacaklar listesi




    }

}
