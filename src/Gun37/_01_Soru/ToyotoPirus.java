package Gun37._01_Soru;

public class ToyotoPirus extends Vehicle implements IElectric, IGas {
    public ToyotoPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Omur boyu kullan";
    }

    @Override
    public String changeOil() {

        return "Bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "Ilk 3 km elektrik bekler";
    }
}
