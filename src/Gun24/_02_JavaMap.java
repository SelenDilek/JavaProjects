package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>(); //ilk degeri ben belirlerim ikinci degere bilgiler gelir disaridan.
        hm.put(1001, "IsmetTemur");
        hm.put(1002, "Yusuf Yilmaz");
        hm.put(2001, "Bugra Yildiz");
        hm.put(5001, "Elife Sozen");
        hm.put(1002, "Seda Pacan");

        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println(" hm.values() = " + hm.values()); //ciktilar fotograf gibi dizi degil bu yuzden yazdirmaya ihtiyac var

        for(Integer k : hm.keySet()){
            System.out.println(k +"\t");
        }

        System.out.println();

        for(String v: hm.values()){
            System.out.println(v +"\t");

        }


        //enteryset hepsi demek key ve valur beraber

        for (Map.Entry<Integer,String> kv: hm.entrySet()){

            System.out.println(kv.getKey() + " - " + kv.getValue());
        }

    }
}
