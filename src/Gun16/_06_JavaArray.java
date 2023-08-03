package Gun16;

import java.util.Scanner;

public class _06_JavaArray {
    public static void main(String[] args) {

       String tvler [] = {"atv" , "fox" , "kanal d" , " TV8" , "startv"};


        int rndIndex = (int) (Math.random() * (tvler.length));

        System.out.println("random = " + rndIndex);

        System.out.println("Kanal adi= " + tvler[rndIndex]);


        //bir dongu ile rastgale buldurunuz fakat bir buldugunu yine bulmasin




    }
}
