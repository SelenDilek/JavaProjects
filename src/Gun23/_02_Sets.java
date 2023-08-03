package Gun23;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        
        //SETS (TEKRAR YOK) (OZEL DIZILER)
        //HashSet : HIZLI , bunun icin kendine algoritmik sirada tutar.
        //LinkedHashSet : EKLENME SIRASI na gore sirali tutuyor. FIFO
        //TreeSet : her zaman icinde sirali tutyor. (Kendinden sort lu)


        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);

        //LinkedHashSet : EKLENME SIRASINA GORE

        LinkedList<String> lhs = new LinkedList<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);

        //TreeSet: herzaman icinde SIRALI sekilde tutar. kendisinden sortlu

        TreeSet<String> ts = new TreeSet<>(); //Aritmetik siralayacak kendinden sirali olacak.
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);





    }
}
