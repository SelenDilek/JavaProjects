package Gun27._02_Ornek;

public class SoruMain {
    public static void main(String[] args) {

        int max = MyMath.getMax(5, 6);
        System.out.println("max = " + max);

        int min = MyMath.getMin(5, 6);
        System.out.println("min = " + min);

        double us = MyMath.getPower(2, 3);
        System.out.println("us = " + us);

        double karekok = MyMath.getSqrt(4); //karekok
        System.out.println("karekok = " + karekok);

        int rndSayi = MyMath.getRandom(10);
        System.out.println("rndSayi = " + rndSayi);


    }
}
