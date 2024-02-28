public class RealEstate {
    private final double area;
    private final int numberOfRooms;


    public RealEstate(double area, int numberOfRooms) {
        this.area = area;
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
