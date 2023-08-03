package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        //degisken ismi bulmak zor Javada. Ayni fonk ayni isi yapiyorsa farkli degerlerle methodlarla ayni fonsiyonu
        //olusturabiliriz birden cok kere.

        int s1=5;
        int s2=4;
        double d1=1.2;
        double d2=2.5;

        int sonuc1=topla(s1,s2);
        double sonuc2=topla(d1,d2);
        //methodlara ayni isim verebilirim, yeterki parametreden ayirt edilebilsin.
        //ayni methodun yapacagi islemi farkli tiplere yaptirabiliriz(int i double float a yaptirmak gibi)

    }

    public static int topla(int s1 , int s2){

        return s1+s2;
    }


    public static double topla(double ahmet1 , double s2){

        return ahmet1+s2;
    }

}
