public class Szemely {
    private final String nev;

    public Szemely(String nev, int azonosito) {
        this.nev = nev;
        this.azonosito = azonosito;
    }

    private final int azonosito;

    public String getNev() {
        return nev;
    }

    public int getAzonosito() {
        return azonosito;
    }
}
