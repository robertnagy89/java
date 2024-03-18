public class TermeszetesSzam {
    private int szam;

    public TermeszetesSzam(int szam) throws NemPozitivSzamException {
        if(szam<0){
            throw new NemPozitivSzamException();
        }
        this.szam = szam;
    }

    @Override
    public String toString() {
        return "TermeszetesSzam{" +
                "szam=" + szam +
                '}';
    }
}
