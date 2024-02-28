import java.util.Objects;

public class Bread {
    private final String breadType;

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                '}';
    }

    public String getBreadType() {
        return breadType;
    }

    public Bread(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bread bread = (Bread) o;
        return Objects.equals(breadType, bread.breadType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breadType);
    }
}
