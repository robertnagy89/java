public class Ember {
    private String nev;
    public static int emberekSzama;

    public Ember(String nev) {
        this.nev = nev;
        emberekSzama++;
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                '}';
    }
}
