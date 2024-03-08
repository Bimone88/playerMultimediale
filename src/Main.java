import multimedia.*; // importo TUTTE le clssi
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5]; // Creo un array di ElementoMultimediale

        // Creazione degli elementi multimediali
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci il titolo per l'elemento " + (i + 1) + ": ");
            String titolo = scanner.nextLine();
            System.out.println("Scegli il tipo di elemento (1 per Immagine, 2 per Registrazione Audio, 3 per Video): ");
            int tipo = Integer.parseInt(scanner.nextLine());

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, luminosita); // creazione istanza di IMMAGINE che metto nell'array
                    break;
                case 2:
                    System.out.println("Inserisci il volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine()); // Chiede la durata
                    elementi[i] = new MiaRegistrazioneAudio(titolo, volume, durataAudio); // Passa la durata
                    break;
                case 3:
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine()); // Chiede la durata
                    elementi[i] = new Video(titolo, luminositaVideo, volumeVideo, durataVideo); // Passa la durata
                    break;
                default:
                    System.out.println("Tipo non valido.");
            }
        }

        // Esecuzione degli elementi multimediali
        int scelta;
        do {
            System.out.println("Scegli quale elemento eseguire (da 1 a 5, 0 per terminare): ");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1]; // Prendiamo l'elemento multimediale dall'array in base alla scelta dell'utente

                // elementi e azioni
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show(); // METODO show su IMMAGINE, abbastanza autoesplicativo :)
                } else if (elemento instanceof RegistrazioneAudio) {
                    RegistrazioneAudio audio = (RegistrazioneAudio) elemento;
                    audio.play(); // METODO play su AUDIIO
                    // chiedo all'utente su richiesya per alzare e abbassare il volume
                } else if (elemento instanceof Video) {
                    Video video = (Video) elemento;
                    video.play(); //  METODO play fatto su VIDEO
                    // Qua richiedo all'utente se buole abbassare o alzare il volume
                }
            }
        } while (scelta != 0);

        scanner.close();
    }
}



