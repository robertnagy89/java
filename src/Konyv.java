public class Konyv {
    private String cim;
    private int ar;
    private boolean akcios;

    public int getAr() {
        return ar;
    }

    public String getCim() {
        return cim;
    }

    public Konyv(String cim, int ar, boolean akcios) {
        this.cim = cim;
        this.ar = ar;
        this.akcios = akcios;
    }

    public void setAkcios(boolean akcios) {
        this.akcios = akcios;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }
}
