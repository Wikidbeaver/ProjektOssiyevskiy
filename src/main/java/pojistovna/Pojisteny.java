package pojistovna;

// Trida reprezentujici pojisteneho
public class Pojisteny {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    // Konstruktor udaju o pojistenem
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }
    // gettery jmena a prijmeni
    public String getPrijmeni() {
        return prijmeni;
    }

    // Metoda pro vypis informace o pojistenem
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", věk: " + vek + ", telefon: " + telefon;
    }
}