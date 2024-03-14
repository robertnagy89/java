public class Diak extends Szemely{
    private final int evfolyam;

    public int getEvfolyam() {
        return evfolyam;
    }

    public Diak(String nev, int azonosito, int evfolyam) {
        super(nev, azonosito);
        this.evfolyam = evfolyam;
    }

    @Override
    public String toString() {
        return super.getNev() + " (" + getEvfolyam() + ". évfolyamos diák.)";
    }
}
