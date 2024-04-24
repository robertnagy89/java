public class House extends RealEstate implements Comparable<House>{
    private boolean pool;
    private double gardenArea;

    public House(double area, int numberOfRooms, boolean pool, double gardenArea) {
        super(area, numberOfRooms);
        this.pool = pool;
        this.gardenArea = gardenArea;
    }

    public boolean isPool() {
        return pool;
    }

    public double getGardenArea() {
        return gardenArea;
    }

    @Override
    public String toString() {
        return "House{" +
                "pool=" + pool +
                ", gardenArea=" + gardenArea +
                '}';
    }

    @Override
    public int compareTo(House o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }
        if(this.getArea() < o.getArea()){
            return -1;
        }
        return 0;
    }
}
