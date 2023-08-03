package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        //HashSet komutlar :
        //Basin toplantiinda bir cikan TV tekrar cikmasin.
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(67);
        hs.add(34);
        hs.add(1);
        hs.add(1);
        hs.add(3);
        hs.add(4);
        System.out.println("hs = " + hs);

        System.out.println("hs.size() = " + hs.size());

        hs.remove(5); // degere gore siler.
        System.out.println("hs = " + hs);
        
        if(hs.contains(67))
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear();
        System.out.println("hs = " + hs);

        
        
        
        
        
        
        
        
        
    }
}
