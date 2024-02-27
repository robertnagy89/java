import java.util.Objects;

public class GuineaPig extends Cavia{
    String favoriteHay;

    GuineaPig(String name, int teethGrowthRatio, String favoriteHay)
    {
        super(name,teethGrowthRatio);
        this.favoriteHay = favoriteHay;
    }

    @Override
    public String toString() {
        return "GuineaPig{" +
                "favoriteHay='" + favoriteHay + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuineaPig guineaPig = (GuineaPig) o;
        return Objects.equals(favoriteHay, guineaPig.favoriteHay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoriteHay);
    }
}
