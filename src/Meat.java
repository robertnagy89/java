import java.util.Objects;

public class Meat {
    private final String meatType;

    public Meat(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "meatType='" + meatType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meat meat = (Meat) o;
        return Objects.equals(meatType, meat.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meatType);
    }
}
