public enum PizzaSize {
    Small(1),
    Medium(1.25),
    Large(1.5),
    ExtraLarge(2);

    public double multiplier;
    PizzaSize(double multiplier) {
    }
}
