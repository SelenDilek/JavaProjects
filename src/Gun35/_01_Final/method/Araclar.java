package Gun35._01_Final.method;

public class Araclar {
    private  String model ;

    public Araclar(String model) {
        setModel(model);
    }

    public final void setKilometre(){
        System.out.println("gosterge set edildi.");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}
