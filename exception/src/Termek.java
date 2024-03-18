public class Termek {
    private String nev;
    private int keszletenLevoMennyiseg;

    public Termek(String nev, int keszletenLevoMennyiseg){
        this.nev = nev;
        if(keszletenLevoMennyiseg < 0){
            this.keszletenLevoMennyiseg = 0;
        }
        this.keszletenLevoMennyiseg = keszletenLevoMennyiseg;
    }

    public void levonKeszletbol(int mennyiseg) throws NincsKeszletenException{
        if(keszletenLevoMennyiseg - mennyiseg < 0){
            throw new NincsKeszletenException();
        }
        keszletenLevoMennyiseg -= mennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public int getKeszletenLevoMennyiseg() {
        return keszletenLevoMennyiseg;
    }
}
