public class SamsungShop {
    private int current = 0;
    private int size;
    private ElectronicDevice[] electronicDevices;

    public SamsungShop(int size) {
        this.size = size;
        this.electronicDevices = new ElectronicDevice[size];
    }
    public void addSamsungDevice(ElectronicDevice device){
        if(current >size){
            current = 0;
        }
        if(device.getBrand() == "Samsung"){
            electronicDevices[current] = device;
            current++;
            if(device instanceof Television){
                System.out.println("Samsung tv hozzáadva.");
            }
            if(device instanceof SmartPhone){
                System.out.println("Samsung smartPhone hozzáadva.");
            }
        }
    }
}
