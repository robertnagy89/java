public class Hamburger {
    private Meat meat;
    private Cheese cheese;
    private Bread bread;

    public Hamburger(Meat meat, Cheese cheese, Bread bread) {
        this.meat = meat;
        this.cheese = cheese;
        this.bread = bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "meat=" + meat +
                ", cheese=" + cheese +
                ", bread=" + bread +
                '}';
    }
}
