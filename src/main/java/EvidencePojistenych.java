import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Trida pro spravu seznamu pojistenych
class EvidencePojistenych {
    private List<Pojisteny> pojisteni = new ArrayList<>(); // List pro ukladani seznamu pojistenych


    // Metoda pridani pojisteneho
    public void pridejPojisteneho(Scanner scanner) {
        System.out.print("Zadejte jméno: ");
        String jmeno = nactiNeprazdne(scanner);

        System.out.print("Zadejte příjmení: ");
        String prijmeni = nactiNeprazdne(scanner);

        System.out.print("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine()); // Prevod na cislo

        System.out.print("Zadejte telefon: ");
        String telefon = scanner.nextLine();

        pojisteni.add(new Pojisteny(jmeno, prijmeni, vek, telefon)); // Ulozeni pojisteneho do seznamu
        System.out.println("Pojištěný byl přidán.");
    }

    // Metoda pro vypis pojistenych
    public void vypisVsechny() {
        if (pojisteni.isEmpty()) {
            System.out.println("Žádní pojištění nejsou evidováni.");
        } else {
            for (Pojisteny p : pojisteni) {
                System.out.println(p);
            }
        }
    }

    // Metoda pro vyhledavani pojisteneho
    public void vyhledatPojisteneho(Scanner scanner) {
        System.out.print("Zadejte jméno: ");
        String jmeno = scanner.nextLine().trim();
        System.out.print("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine().trim();

        boolean nalezen = false;
        for (Pojisteny p : pojisteni) {
            if (p.getJmeno().equalsIgnoreCase(jmeno) && p.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println(p); // Vysledek hledani
                nalezen = true;
            }
        }
        if (!nalezen) {
            System.out.println("Pojištěný nenalezen.");
        }
    }

    // Metoda proti prazdnemu retezci
    private String nactiNeprazdne(Scanner scanner) {
        String vstup;
        while (true) {
            vstup = scanner.nextLine().trim();
            if (!vstup.isEmpty()) {
                return vstup;
            }
            System.out.print("Hodnota nesmí být prázdná, zkuste to znovu: ");
        }
    }
}
