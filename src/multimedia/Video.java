package multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    // istanza variavili:
    private int luminosita;
    private int volume;

    // ----------- COSTRUTTORE PER VIDEO -------------------
    public Video(String titolo, int luminosita, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void show() { // EREDITARIETà DA ElementoMultimediale
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    public void play() { // richeiesto dall'Interfaccia, lo richiamo qui:
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(i + 1) + "*".repeat(luminosita));
        }
    }
}

