package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Set -> HashSet , LinkedHashSet , TreeSet
        //Map -> HashMap , LinkedHashMap , TreeMap
        //Map -> Anahtar +Set -> Anahtarli Set (Tekrar eden anahtar yok)

        //Anahtarin tipi Integer value degeri ise String

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1001, "IsmetTemur");
        hm.put(1002, "Yusuf Yilmaz");
        hm.put(2001, "Bugra Yildiz");
        hm.put(5001, "Elife Sozen");
        hm.put(1002, "Seda Pacan");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hmmcont = " + hm.containsKey(2001));
        System.out.println("hmmcont = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println(" hm.values() = " + hm.values());

        hm.remove(5001);
        System.out.println("hm = " + hm);









    }
}
