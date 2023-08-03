package Gun27.Deneme;

import java.util.ArrayList;

public class Students {
    String name ;
    int dersSayisi;
    int maxSaat ;

    ArrayList<Lessons> dersler = new ArrayList<>();


    Lessons lessons = new Lessons();


    public Students() {
        System.out.println("** Ogrenci Bilgileri **");
    }

    public Students(String name) {
        this.name = name;
    }



    public static  int odemeTutari(int aylikOdeme){
        int aylikOdemeToplami=0 ;
       aylikOdemeToplami+= aylikOdeme;
       return  aylikOdemeToplami;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", maxSaat=" + maxSaat +
                '}';
    }

    public void yazdir(){

        for(Lessons lesson : this.dersler) {
            System.out.println("Ders adi = " + lesson.dersAdi + " " +"Ders Saati = " + lesson.dersSaati);

        }

    }
}
