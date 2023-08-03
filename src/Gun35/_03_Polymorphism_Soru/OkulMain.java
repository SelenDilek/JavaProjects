package Gun35._03_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr = new Ogrenci("Ayse", "Yilmaz","Ogrenci","5A");
        Calisan cal = new Calisan("Ali","Demir","Tester","IT");

        Kisi.kimlikBelgesiYazdir(ogr);
        Kisi.kimlikBelgesiYazdir(cal);






        //Kisi ogr1 = new Ogrenci("Selen","Dilek","Ogrenci","5A");
        //Kisi calisan1 = new Calisan("Ali" ,"Yilmaz","Mudur","Yonetim");
        //System.out.println( ogr1.toString());
        //System.out.println( calisan1.toString());





    }
}
