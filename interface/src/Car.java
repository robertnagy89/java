public class Car implements Presentable {
    public String model;
    public String make;

    public int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void present() {
        System.out.println("A " + model + " " + make + " from " + year);
    }
}
