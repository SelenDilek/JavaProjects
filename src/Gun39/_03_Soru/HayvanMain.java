package Gun39._03_Soru;

public class HayvanMain {
    public static void main(String[] args) {

        Kedi kedi = new Kedi("Kopuk", false ,"01.08.2000");
        Kartal kartal = new Kartal("BJK<3" , true , "06.09.2004");

        System.out.println(kedi.getClass().getSimpleName());
        System.out.println(kedi);
        kedi.yiyecegi();
        kedi.yemekMiktari();
        kedi.sesi();
        kedi.gunlukUykuSuresi();


        System.out.println("*****************************************");
        System.out.println();


        System.out.println(kartal.getClass().getSimpleName());
        System.out.println( kartal);
        kartal.yemekMiktari();
        kartal.sesi();
        kartal.yiyecegi();
        kartal.gunlukUykuSuresi();

    }
}
