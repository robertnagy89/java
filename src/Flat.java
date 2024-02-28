public class Flat extends RealEstate{
    private final boolean balcony;
    private final int level;

    public Flat(double area, int numberOfRooms, boolean balcony, int level) {
        super(area, numberOfRooms);
        this.balcony = balcony;
        this.level = level;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + "type : Flat{" +
                "balcony=" + balcony +
                ", level=" + level +
                '}';
    }
}
