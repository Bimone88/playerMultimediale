package multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int luminosita;
    private int volume;
    private int durata;

    // Costruttore con i nuovi attributi
    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;
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

    // Metodo per aumentare la luminosità
    public void aumentaLuminosita() {
        luminosita += 10;
    }

    // Metodo per diminuire la luminosità
    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita -= 10;
    }


    // Metodo di stampa per visualizzare le informazioni VIDEO
    public void stampa() {
        System.out.println("Video: " + titolo + " - Luminosita: " + luminosita + " - Volume: " + volume);
    }

    // Override del metodo play per riprodurre il video
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) { // DURATA
            System.out.println(titolo + ": " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }
}
