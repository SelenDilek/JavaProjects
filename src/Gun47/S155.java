package Gun47;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null); //null bir degerdir. referansi yok anlamina da gelir.
        points.remove(1); //sadece rakam olarak verilirse index oldugunu anlar java.
        points.remove((Object)1); //bu islem 1 degerini siler indexe gore degil.
        points.remove(null);
        System.out.println("points = " + points);

        //NOT:
        //String , Integer, Double , Long NULL alabiliyor
        //int,double,float,long -> default 0


        
        
    }
}
