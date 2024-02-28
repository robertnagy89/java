public class House extends RealEstate{
    private final boolean pool;
    private final double gardenArea;

    public House(double area, int numberOfRooms, boolean pool, double gardenArea) {
        super(area, numberOfRooms);
        this.pool = pool;
        this.gardenArea = gardenArea;
    }

    @Override
    public String toString() {
        return super.toString() + " Type House{" +
                "pool=" + pool +
                ", gardenArea=" + gardenArea +
                '}';
    }
}
