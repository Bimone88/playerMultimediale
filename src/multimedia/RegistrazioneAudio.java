package multimedia;

public abstract class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile { // classe astratta
    private int volume;

    public RegistrazioneAudio(String titolo, int volume) { // paramettri
        super(titolo);
        this.volume = volume;
    }

    public void play() { // metodo fatto per la registrazionee audio
        for (int i = 0; i < volume; i++) {
            System.out.println(titolo + ": " + "!".repeat(i + 1));
        }
    }
}




