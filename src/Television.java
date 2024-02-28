public class Television extends ElectronicDevice{
    private double diagonalWidth;
    public Television(String brand, String model, double diagonalWidth) {
        super(brand, model);
        this.diagonalWidth = diagonalWidth;
    }

    public double getDiagonalWidth() {
        return diagonalWidth;
    }

    @Override
    public String toString() {
        return "Television{" +
                "diagonalWidth=" + diagonalWidth +
                '}';
    }
}
