public class Laptop extends Termek {
    private String processorTipus;
    private double kepatlo;

    public Laptop(String megnevezes, int ar, int kepatlo){
        super(megnevezes, ar);
        this.kepatlo = kepatlo;
    }

    public double getKepatlo() {
        return kepatlo;
    }

    @Override
    public String toString() {
        return super.getAzonosito() + " " + super.getMegnevezes() + " " + super.getAr();
    }
}
