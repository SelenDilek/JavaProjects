package Gun33._01_Inheritance;

public class SirketMain {
    public static void main(String[] args) {

        //Bir classtan digerine her seyi miras alabiliyoruz:inheritance

        YoneticiYeni yy = new YoneticiYeni();
        yy.setAd("Selen");
        yy.zamYap();
        System.out.println("yy = " + yy);

    }
}
