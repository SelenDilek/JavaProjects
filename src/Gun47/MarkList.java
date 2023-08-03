package Gun47;

import java.util.Map;

public class MarkList {
    int num;

    public static void graceMark(MarkList obj4){//fonksiyondaki adi obj4 ama obj1 ve obj2 dir
        obj4.num+=10; //fonksiyona nesnenin kendisi gider, ayni dizi gibi


    }


    public static void main(String[] args) {

        MarkList obj1 = new MarkList(); //bir tane nesne var obj1.num=>0
        System.out.println("obj1.num = " + obj1.num);
        MarkList obj2 = obj1; //obj.num -> 0
        MarkList obj3=null;
        MarkList obj4;

        obj2.num=60; //obj.num -> 60 , obj1.num->60
        System.out.println("obj2.num = " + obj2.num);
        System.out.println("obj1.num = " + obj1.num);

        graceMark(obj2);//ayni zamanda obj1
        System.out.println("obj2.num = " + obj2.num); //70
        System.out.println("obj1.num = " + obj1.num); //70

        //obj lerde diziler gibi birbirlerine esitlenince referanslari esit oluyor ayninesne gibi davraniyorlar
        // obj lerin kendileri gider diziler gibi degerini staticte degistirir ve maine getirir.


        //Hafizada kac tane MarkList Nesnesi var. Yani kac obje MarkListten olusmus.
    }
}
