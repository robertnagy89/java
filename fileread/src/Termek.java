public class Termek {
    private static int kovetkezoAzonosito = 100000;
    private int azonosito;
    private String megnevezes;
    private int ar;

    public Termek(String megnevezes, int ar) {
        this.azonosito = kovetkezoAzonosito++;
        this.megnevezes = megnevezes;
        this.ar = ar;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return getAzonosito() + " " + getMegnevezes() + " " + getAr();
    }

    @Override
    public boolean equals(Object termek) {
        if(termek instanceof Termek){
            return ((Termek) termek).azonosito == this.azonosito;
        }
        return false;
    }
}
