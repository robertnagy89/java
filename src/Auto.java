public class Auto {
    private String gyarto;
    private String modell;
    private int gyartasiEv;
    private int kerekekSzama;
    private int ulesekSzama;
    private String alvazSzam;
    private static int alvazSzamSzamlalo = 0;
    private String tulajdonosNeve;

    public Auto(String gyarto, String modell, int gyartasiEv, int kerekekSzama, int ulesekSzama, String alvazSzam, String tulajdonosNeve) {
        this.gyarto = gyarto;
        this.modell = modell;
        this.gyartasiEv = gyartasiEv;
        this.kerekekSzama = kerekekSzama;
        this.ulesekSzama = ulesekSzama;
        this.alvazSzam = alvazSzam;
        alvazSzamSzamlalo++;
        this.tulajdonosNeve = tulajdonosNeve;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public void setGyartasiEv(int gyartasiEv) {
        this.gyartasiEv = gyartasiEv;
    }

    public int getKerekekSzama() {
        return kerekekSzama;
    }

    public void setKerekekSzama(int kerekekSzama) {
        this.kerekekSzama = kerekekSzama;
    }

    public int getUlesekSzama() {
        return ulesekSzama;
    }

    public void setUlesekSzama(int ulesekSzama) {
        this.ulesekSzama = ulesekSzama;
    }

    public String getAlvazSzam() {
        return alvazSzam;
    }

    public void setAlvazSzam(String alvazSzam) {
        this.alvazSzam = alvazSzam;
    }

    public String getTulajdonosNeve() {
        return tulajdonosNeve;
    }

    public void setTulajdonosNeve(String tulajdonosNeve) {
        this.tulajdonosNeve = tulajdonosNeve;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "gyarto='" + gyarto + '\'' +
                ", modell='" + modell + '\'' +
                ", gyartasiEv=" + gyartasiEv +
                ", kerekekSzama=" + kerekekSzama +
                ", ulesekSzama=" + ulesekSzama +
                ", alvazSzam='" + alvazSzam + '\'' +
                ", tulajdonosNeve='" + tulajdonosNeve + '\'' +
                '}';
    }
}
