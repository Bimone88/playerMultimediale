package multimedia;

public abstract class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int volume;

    // -------------- COSTRUTTORE --------------
    public RegistrazioneAudio(String titolo, int volume) {
        super(titolo);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {  // richeiesto dall'Interfaccia, lo richiamo qui:
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < volume; i++) {
            sb.append("!"); // per far si che ogni tacca di volume è un ! ( spero sia corretto )
        }
        System.out.println(titolo + ": " + sb.toString());
    }
}





