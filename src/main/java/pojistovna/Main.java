package pojistovna;

import java.util.Scanner;

// Hlavni trida
public class Main {
    public static void main(String[] args) {
        EvidencePojistenych evidence = new EvidencePojistenych(); // Vytvoreni instance pro evidence pojistenych
        Scanner scanner = new Scanner(System.in); // Scanner pro volbu v menu programu

        while (true) { // Hlavni cyklus tvorici menu
            try {
                // Vlastne menu
                System.out.println("\nEVIDENCE POJIŠTĚNÝCH");
                System.out.println("1 - Přidat pojištěného");
                System.out.println("2 - Vypsat všechny pojištěné");
                System.out.println("3 - Vyhledat pojištěného");
                System.out.println("4 - Konec");
                System.out.print("Zadejte volbu: ");

                String volba = scanner.nextLine();

                switch (volba) {
                    case "1":
                        evidence.pridejPojisteneho(scanner); // Novy pojisteny
                        break;
                    case "2":
                        evidence.vypisVsechny(); // Vypis vsech pojistenych
                        break;
                    case "3":
                        evidence.vyhledatPojisteneho(scanner); // Vyhledavani
                        break;
                    case "4":
                        System.out.println("Ukončuji aplikaci."); // Ukonceni
                        return;
                    default:
                        System.out.println("Neplatná volba."); // Pri spatne volbe
                }
            } catch (Exception e) {
                System.out.println("Došlo k chybě: " + e.getMessage()); // Chyta vyjimky
            }
        }
    }
}