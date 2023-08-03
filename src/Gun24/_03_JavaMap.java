package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>(); //Maplerden HashMap
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"kopek");
        hm.put(11,"kus");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm); //forografini gosterir sadece yazdirmaz. hizli calismak icin kendisinden sirali.

        Map<Integer,String> lhm = new LinkedHashMap<>(); //Maplerden LinkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"kopek");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm); //forografini gosterir sadece yazdirmaz.//eklenme sirasina gore sirali

        Map<Integer,String> tm = new TreeMap<>(); //Map lerden TreeMap
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"kopek");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm); //her zaman sirali kendinden sortlu








    }
}
