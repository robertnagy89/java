public class SmartPhone extends ElectronicDevice{
    private int storageCapacity;
    public SmartPhone(String brand, String model, int storageCapacity) {
        super(brand, model);
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "storageCapacity=" + storageCapacity +
                '}';
    }
}
