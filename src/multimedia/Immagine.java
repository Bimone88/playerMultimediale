package multimedia;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    // -------- COSTRUTTORE ---------
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(titolo + ": " + "*".repeat(luminosita));
    }
}