public class Motorbike extends Vehicle{
    private int maxSpeed;

    public Motorbike(String manufacturer, String model, int year, int maxSpeed){
        super(manufacturer, model, year);
        if(maxSpeed > 300){
            this.maxSpeed = 300;
        }
        if (maxSpeed < 0){
            this.maxSpeed = 0;
        }
        else{
            this.maxSpeed = maxSpeed;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 300){
            this.maxSpeed = 300;
        }
        if (maxSpeed < 0){
            this.maxSpeed = 0;
        }
        else{
            this.maxSpeed = maxSpeed;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return super.getManufacturer() + " "+ super.getModel() + " " + super.getYear() + " Max Speed: " + getMaxSpeed();
    }
}
