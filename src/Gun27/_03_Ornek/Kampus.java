package Gun27._03_Ornek;

public class Kampus {
    public static void main(String[] args) {
        Student.universiteKurallari(); //classadi.method = static

        Lesson ders1 = new Lesson(); //3.adim
        Lesson ders2 = new Lesson();
        Lesson ders3 = new Lesson();

        ders1.name="Algoritma";
        ders1.saat=6;
        ders2.name="Java";
        ders2.saat=6;
        ders3.name="Test Tool";
        ders3.saat=8;

        Student ogr1 = new Student(); //4.Adim
        ogr1.name="Korhan";
        ogr1.maxSaat=20;

        ogr1.dersleri.add(ders1); //5.Adim
        ogr1.dersleri.add(ders2);
        ogr1.dersleri.add(ders3);

        ogr1.dersYazdir(); //nesneadi.method = non-static




    }
}
