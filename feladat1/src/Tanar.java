public class Tanar extends Szemely{
    private final String szak;

    public String getSzak() {
        return szak;
    }

    public Tanar(String nev, int azonosito, String szak) {
        super(nev, azonosito);
        this.szak = szak;
    }

    @Override
    public String toString() {
        return super.getNev() + " (" + getSzak() + " szakos tanár.)";
    }
}
