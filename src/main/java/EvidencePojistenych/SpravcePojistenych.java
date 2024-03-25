package EvidencePojistenych;

import java.util.ArrayList;

public class SpravcePojistenych {
    private ArrayList<Pojistenec> pojistenci;

    public SpravcePojistenych() {
        pojistenci = new ArrayList<>();
    }

    public void pridejPojisteneho(String jmeno, String prijmeni, String telCislo, int vek) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, telCislo, vek));
    }

    public String vyhledejPojistene(String jmeno, String prijmeni) {
        String pojistenciRetezec = "";
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.vratJmeno().toLowerCase().startsWith(jmeno.toLowerCase()) && pojistenec.vratPrijmeni().toLowerCase().startsWith(prijmeni.toLowerCase())) {
                pojistenciRetezec += pojistenec;
            }
        }
        if (pojistenciRetezec.equals("")) {
            return "Pojištenec nenalezen";
        }
        return pojistenciRetezec;
    }

    public String vratVsechnyPojistene() {
        return vyhledejPojistene("", "");
    }

    @Override
    public String toString() {
        return vyhledejPojistene("", "");
    }
}
