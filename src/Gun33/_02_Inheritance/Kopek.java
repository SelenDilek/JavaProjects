package Gun33._02_Inheritance;

public class Kopek extends Hayvan{
    public Kopek(String renk, double kilo, String cinsi) {
        super(renk, kilo, cinsi); //constructer sartli miras olarak gelir.
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Havladi" );
    }


}
