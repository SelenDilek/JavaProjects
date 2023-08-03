package Gun38._02_Abstract;

public abstract class Sekil {
    private String name ;

    abstract double Alan();
    abstract double Cevre();

    public void ciz(){

        System.out.println(this.name + " sekli cizildi.");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil:" +
                "\nName=" + name +
                "\nAlan=" + Alan() +
                "\nCevre=" + Cevre();
    }
}
