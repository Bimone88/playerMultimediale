package multimedia;

public class Immagine extends ElementoMultimediale implements Visualizzabile {
    private int luminosita;

    // -------- COSTRUTTORE ---------
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    // METODOper aumentare la luminosità
    public void aumentaLuminosita() {
        luminosita += 10;
    }

    // METODO per diminuire la luminosità
    public void diminuisciLuminosita() {
        luminosita -= 10;
        if (luminosita < 0) {
            luminosita = 0;
        }
    }

    // Getter e setter per luminosità
    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    // Metodo di stampa per vedere info immagine
    public void stampa() {
        System.out.println("Immagine: " + titolo + " - Luminosita: " + luminosita);
    }

    // Override del metodo show per vedere l'immagine
    @Override
    public void show() {
        System.out.println(titolo + ": " + "*".repeat(luminosita));
    }
}