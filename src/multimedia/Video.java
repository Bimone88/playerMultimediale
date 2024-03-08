package multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int luminosita;
    private int volume;

    public Video(String titolo, int luminosita, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
    }

    public void show() {
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    public void play() {
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(i + 1) + "*".repeat(luminosita));
        }
    }
}

