package multimedia;

public class MiaRegistrazioneAudio extends RegistrazioneAudio {
    public MiaRegistrazioneAudio(String titolo, int volume) {
        super(titolo, volume);
    }

    @Override
    void show() {
        // Implementazione del metodo show per la registrazione audio dato che era astratta
        System.out.println("Registrazione audio: " + titolo);
    }
}


