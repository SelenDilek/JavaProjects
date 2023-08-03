package Gun31._04_Soru;

public class Pizza {
    PizzaSize pizzaSize ;

    public Pizza(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                '}';
    }
}
