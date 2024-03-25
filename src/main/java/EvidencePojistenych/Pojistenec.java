package EvidencePojistenych;

public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private String telCislo;
    private int vek;

    public Pojistenec(String jmeno, String prijmeni, String telCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telCislo = telCislo;
        this.vek = vek;
    }

    public String vratJmeno() {
        return jmeno;
    }

    public String vratPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + telCislo + " " + vek + "\n";
    }
}
