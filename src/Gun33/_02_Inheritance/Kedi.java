package Gun33._02_Inheritance;

public class Kedi extends  Hayvan{
    public Kedi(String renk, double kilo, String cinsi) {
        super(renk, kilo, cinsi); //super : miras alinan sinif
    }


    @Override
    public void konustu() {
        super.konustu();
        System.out.println("miyavladi");
    }
}
