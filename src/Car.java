public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String manufacturer,String model, int year, int numberOfSeats){
        super(manufacturer,model,year);
        this.numberOfSeats = numberOfSeats;
    }

    public String toString(){
        return super.getManufacturer() + " " + super.getModel() + " " + super.getYear() + " NumberofSeats" + this.numberOfSeats;
    }

}
