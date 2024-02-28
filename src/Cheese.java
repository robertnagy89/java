import java.util.Objects;

public class Cheese {
    private final String cheeseType;

    public String getCheeseType() {
        return cheeseType;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "cheeseType='" + cheeseType + '\'' +
                '}';
    }

    public Cheese(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cheese cheese = (Cheese) o;
        return Objects.equals(cheeseType, cheese.cheeseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cheeseType);
    }
}
