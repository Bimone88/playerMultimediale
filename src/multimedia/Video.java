package multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int luminosita;
    private int volume;

    // Costruttore con i nuovi attributi
    public Video(String titolo, int luminosita, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
    }

    // Getter e setter per luminosità
    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    // Getter e setter per volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Metodo di stampa per visualizzare le informazioni del video
    public void stampa() {
        System.out.println("Video: " + titolo + " - Luminosita: " + luminosita + " - Volume: " + volume);
    }

    // Override del metodo show per visualizzare il video
    @Override
    void show() {
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    // Override del metodo play per riprodurre il video
    @Override
    public void play() {
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(i + 1) + "*".repeat(luminosita));
        }
    }
}

