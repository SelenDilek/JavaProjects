package Gun37._01_Soru;


public class cityBus extends  Vehicle implements IDeisel {
    public cityBus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
       return "1 depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "En fazla 90km hic yapabilir";
    }
}
