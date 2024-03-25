package EvidencePojistenych;

import java.util.Scanner;

public class UzivatelskeRozhrani {

    private SpravcePojistenych spravcePojistenych;
    private Scanner scanner;
    private static final String
            textHlavnihoMenu =
            "-----------------------------\n" +
            "Evidence pojištěných\n" +
            "----------------------------\n" +
            "\n" +
            "1 - Přidat nového pojištěného\n" +
            "2 - Vypsat všechny pojištěné\n" +
            "3 - Vyhledat pojištěného\n" +
            "4 - Konec\n";
    public UzivatelskeRozhrani() {
        scanner = new Scanner(System.in);
        spravcePojistenych = new SpravcePojistenych();
    }

    public void vratUzivatelskeRozhrani() {
        String volba = "";

        while (!volba.equals("4")) {
            System.out.println(textHlavnihoMenu);
            volba = scanner.nextLine();

            switch (volba) {
                case "1":
                    spravcePojistenych.pridejPojisteneho(zadejText("jméno", 1, 15),zadejText("příjmení", 2, 30),zadejText("telefonní číslo", 9, 9), zadejVek());
                    System.out.println("Úspěšně přidáno");
                    break;
                case "2":
                    System.out.println(spravcePojistenych.vratVsechnyPojistene());
                    System.out.println("Můžete pokračovat další volbou");
                    break;
                case "3":

                    System.out.println(spravcePojistenych.vyhledejPojistene(zadejText("jméno", 1, 15),zadejText("příjmení", 1, 30)));
                    System.out.println("Můžete pokračovat další volbou");
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Neplatná volba, zadej znovu\n");
                    break;
            }
        }
    }

    private String zadejText(String text, int minDelka, int maxDelka) {
        String vstup;
        System.out.println("Zadejte " + text + " pojištěného:");
        vstup = scanner.nextLine();
        while (vstup.length() < minDelka || vstup.length() > maxDelka) {
            System.out.println("Zadání je příliš krátké nebo příliš dlouhé, zadejte prosím " + text + " znovu:");
            vstup = scanner.nextLine();
        }
        return vstup;
    }

    private int zadejVek() {
        System.out.println("Zadej věk uživatele:");
        int vek = 0;
        while (vek == 0) {
            try {
                vek = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Zadej věk uživatele bez znaků např.: 21");
            }
        }
        return vek;
    }

    public String toString() {
        return "Toto je uživatelské rozhraní, spusť příslušnou funkcí";
    }
}
