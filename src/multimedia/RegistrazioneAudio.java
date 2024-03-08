package multimedia;

public abstract class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int volume;
    private int durata;

    // -------------- COSTRUTTORE --------------
    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Metodo per abbassare il volume
    public void abbassaVolume() {
        if (volume > 0) volume--; // l'importante non vada sotto lo 0
    }

    // Metodo per alzare il volume
    public void alzaVolume() {
        volume++; // si può aggiungere un controllo per il volume max
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





