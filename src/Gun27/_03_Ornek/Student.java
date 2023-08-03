package Gun27._03_Ornek;


import java.util.ArrayList;

public class Student {
    String name ; //2.Adim
    int maxSaat ;

    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersYazdir(){

        System.out.println("\n*** Tranksript ***");
        System.out.println("Sayin, " + this.name);
        System.out.println("Aldiginiz dersler asagidadir" );

        for(Lesson d : this.dersleri)
            System.out.println(d.name + "-" + d.saat);

    }


    public static void universiteKurallari(){ //6.adim

        System.out.println("Kural 1 : Ders calis");
        System.out.println("Kural 2 : Uykunu al");
        System.out.println("Kural 3 : Dinc ve dinamik ol");
        System.out.println("Kural 4 : Tekrarsiz gelmez");
    }


}
