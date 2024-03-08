public class Pizza {
    private String pizzaName;
    private int basePrice;
    private PizzaSize pizzaSize;

    public Pizza(String pizzaName, int basePrice, PizzaSize pizzaSize) {
        this.pizzaName = pizzaName;
        this.basePrice = basePrice;
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPrice(){
        return basePrice*pizzaSize.multiplier;
    }
}
