import java.util.Objects;
import java.util.Set;

public class Lotto {

    private final int year;
    private final int week;
    private final String dateOf;
    private final long highestPrize;
    private final Set<Integer> numbers;


    public Lotto(int year, int week, String dateOf, long highestPrize, Set<Integer> numbers) {
        this.year = year;
        this.week = week;
        this.dateOf = dateOf;
        this.highestPrize = highestPrize;
        this.numbers = numbers;
    }

    public int getYear() {
        return year;
    }

    public int getWeek() {
        return week;
    }

    public String getDateOf() {
        return dateOf;
    }

    public long getHighestPrize() {
        return highestPrize;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lotto lotto = (Lotto) o;
        return year == lotto.year && week == lotto.week && highestPrize == lotto.highestPrize && Objects.equals(dateOf, lotto.dateOf) && Objects.equals(numbers, lotto.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, week, dateOf, highestPrize, numbers);
    }

    @Override
    public String toString() {
        return "Lotto{" +
                "year=" + year +
                ", week=" + week +
                ", dateOf='" + dateOf + '\'' +
                ", highestPrize=" + highestPrize +
                ", numbers=" + numbers +
                '}';
    }
} 