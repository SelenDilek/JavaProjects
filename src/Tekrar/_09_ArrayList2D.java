package Tekrar;

import java.util.ArrayList;

public class _09_ArrayList2D {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari=new ArrayList<>(); // bunun her bir satırı sayı  int[]
        ArrayList<Integer> kimNotlari=new ArrayList<>(); // bunun her bir satırı sayı  int[]

        ArrayList< ArrayList<Integer>  > tumNotlar=new ArrayList<>(); //her bir satırı liste
        // int[][]


        matNotlari.add(5);
        matNotlari.add(6);
        matNotlari.add(7);
        matNotlari.add(8);

        tumNotlar.add(matNotlari);

        matNotlari.add(10);

        kimNotlari.add(53);
        kimNotlari.add(63);
        kimNotlari.add(73);
        kimNotlari.add(83);

        tumNotlar.add(kimNotlari);

        tumNotlar.get(0); // matNotlari
        tumNotlar.get(1); // kimNotlari

        matNotlari.get(0);  // mat ın ilk notunu verir
        tumNotlar.get(0).get(0); // matın ilk notunu verir

        System.out.println("matNotlari.get(0) = " + matNotlari.get(0)); //5
        System.out.println("tumNotlar.get(0).get(0) = " + tumNotlar.get(0).get(0)); //5

        System.out.println("tumNotlar.get(1).get(0) = " + tumNotlar.get(1).get(0)); //53

        
    }
}
