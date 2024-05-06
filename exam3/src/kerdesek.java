import java.util.Objects;

public class kerdesek {
    private final String kerdes;
    private final int valasz;
    private final int hanyadikValasz;
    private final String tema;

    public kerdesek(String kerdes, int valasz, int hanyadikValasz, String tema) {
        this.kerdes = kerdes;
        this.valasz = valasz;
        this.hanyadikValasz = hanyadikValasz;
        this.tema = tema;
    }

    public String getKerdes() {
        return kerdes;
    }

    public int getValasz() {
        return valasz;
    }

    public int getHanyadikValasz() {
        return hanyadikValasz;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        kerdesek kerdesek = (kerdesek) o;
        return valasz == kerdesek.valasz && hanyadikValasz == kerdesek.hanyadikValasz && Objects.equals(kerdes, kerdesek.kerdes) && Objects.equals(tema, kerdesek.tema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kerdes, valasz, hanyadikValasz, tema);
    }

    @Override
    public String toString() {
        return "kerdesek{" +
                "kerdes='" + kerdes + '\'' +
                ", valasz=" + valasz +
                ", hanyadikValasz=" + hanyadikValasz +
                ", tema='" + tema + '\'' +
                '}';
    }
}
