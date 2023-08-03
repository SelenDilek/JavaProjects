package Tekrar;

import java.util.ArrayList;

public class _08_ArrayList {
    public static void main(String[] args) {
        int[] dizi=new int[10]; // boyutu sabit;

        // boyutu değişken , ekledikçe uzayabilsin., sildikçe kısalsın

        ArrayList<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(55);

        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i)); // dizi[i]
        }

      //  list.remove(5); // index olarak görür

        list.remove((Object)5); // değer siler

        System.out.println("list = " + list);
    }
}
