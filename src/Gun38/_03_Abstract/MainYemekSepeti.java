package Gun38._03_Abstract;

import Gun28._04_0rnek.Banka;

public class MainYemekSepeti {
    public static void main(String[] args) {

        System.out.println("*****YEMEK SEPETINE HOSGELDINIZ****");
        System.out.println();

        Baklava baklava = new Baklava();
        System.out.println(baklava.getClass().getSimpleName());
        baklava.madeIn();
        baklava.taste();


        System.out.println("________________________");

        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake.getClass().getSimpleName());
        cheeseCake.madeIn();
        cheeseCake.taste();

        System.out.println("________________________");

        SezarSalad sezarSalad = new SezarSalad();
        System.out.println(sezarSalad.getClass().getSimpleName());
        sezarSalad.madeIn();

        System.out.println("________________________");

        GreekSalad greekSalad = new GreekSalad();
        System.out.println(greekSalad.getClass().getSimpleName());
        greekSalad.madeIn();

        System.out.println();

        System.out.println("AFIYET OLSUN...");


    }
}
