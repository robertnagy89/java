import java.util.Objects;

public class EmissionRekord implements Comparable<EmissionRekord>{
    private final int year;
    private final String state;
    private final String sectorName;
    private final double emissionAmount;
    private final String fuelType;

    public EmissionRekord(int year, String state,String sectorName, double emissionAmount, String fuelType) {
        this.year = year;
        this.state = state;
        this.sectorName = sectorName;
        this.emissionAmount = emissionAmount;
        this.fuelType = fuelType;
    }

    public int getYear() {
        return year;
    }

    public String getState() {
        return state;
    }

    public String getSectorName() {
        return sectorName;
    }

    public double getEmissionAmount() {
        return emissionAmount;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmissionRekord that = (EmissionRekord) o;
        return year == that.year && Double.compare(emissionAmount, that.emissionAmount) == 0 && Objects.equals(state, that.state) && Objects.equals(sectorName, that.sectorName) && Objects.equals(fuelType, that.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, state, sectorName, emissionAmount, fuelType);
    }

    @Override
    public String toString() {
        return "EmissionRekord{" +
                "year=" + year +
                ", state='" + state + '\'' +
                ", sectorName='" + sectorName + '\'' +
                ", emissionAmount=" + emissionAmount +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public int compareTo(EmissionRekord o) {
        return Double.compare(this.getEmissionAmount(), o.getEmissionAmount());
    }
}
