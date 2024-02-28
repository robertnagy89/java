public class ElectronicDevice {
    private String brand;
    private String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
