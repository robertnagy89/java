public class Kamera extends Termek{
    private int MPX;
    public Kamera(String megnevezes, int ar, int MPX){
        super(megnevezes, ar);
        this.MPX = MPX;
    }

    public int getMPX() {
        return MPX;
    }
}
