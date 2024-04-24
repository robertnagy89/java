public class Flat extends RealEstate implements Comparable<Flat>{
    private boolean balcony;
    private int level;

    public Flat(double area, int numberOfRooms, boolean balcony, int level) {
        super(area, numberOfRooms);
        this.balcony = balcony;
        this.level = level;
    }

    public Flat(double area, int numberOfRooms, int level, boolean balcony) {
        super(area, numberOfRooms);
        this.balcony = balcony;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public boolean isBalcony() {
        return balcony;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "balcony=" + balcony +
                ", level=" + level +
                '}';
    }

    @Override
    public int compareTo(Flat o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }
        if(this.getArea() < o.getArea()){
            return -1;
        }
        return 0;
    }
}
