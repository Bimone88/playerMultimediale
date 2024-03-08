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
                case 1: // Immagine
                    System.out.println("Inserisci la luminosità: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2: // Registrazione Audio
                    System.out.println("Inserisci il volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new MiaRegistrazioneAudio(titolo, volume, durataAudio);
                    break;
                case 3: // Video
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, luminositaVideo, volumeVideo, durataVideo);
                    break;
                default:
                    System.out.println("Tipo non valido.");
            }
        }

        // Esecuzione e manipolazione degli elementi multimediali:
        int scelta;
        do {
            System.out.println("Scegli quale elemento eseguire (da 1 a 5, 0 per terminare): ");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta >= 1 && scelta <= elementi.length) {
                ElementoMultimediale elementoSelezionato = elementi[scelta - 1];

                // Esecuzione dell'elemento:
                if (elementoSelezionato instanceof Immagine) {
                    ((Immagine) elementoSelezionato).show();
                } else if (elementoSelezionato instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) elementoSelezionato).play();
                } else if (elementoSelezionato instanceof Video) {
                    ((Video) elementoSelezionato).play();
                }

                // faccio una manipolazione degli attrivbuti speicfici se necessario:
                System.out.println("Vuoi modificare gli attributi dell'elemento? (s/n)");
                String risposta = scanner.nextLine();
                if ("s".equalsIgnoreCase(risposta)) {
                    if (elementoSelezionato instanceof Immagine) {
                        modificaImmagine((Immagine) elementoSelezionato, scanner);
                    } else if (elementoSelezionato instanceof Video) {
                        modificaVideo((Video) elementoSelezionato, scanner);
                    } else if (elementoSelezionato instanceof RegistrazioneAudio) {
                        modificaRegistrazioneAudio((RegistrazioneAudio) elementoSelezionato, scanner);
                    }
                }
            }
        } while (scelta != 0);

        scanner.close();
    }

    private static void modificaImmagine(Immagine immagine, Scanner scanner) {
        System.out.println("Aumentare luminosità (+) o diminuire (-)?");
        String scelta = scanner.nextLine();
        if ("+".equals(scelta)) {
            immagine.aumentaLuminosita();
        } else if ("-".equals(scelta)) {
            immagine.diminuisciLuminosita();
        }
        immagine.show();
    }

    private static void modificaVideo(Video video, Scanner scanner) {
        System.out.println("Aumentare luminosità (+l), diminuire (-l), aumentare volume (+v), diminuire volume (-v)?");
        String scelta = scanner.nextLine();
        switch (scelta) {
            case "+l":
                video.aumentaLuminosita();
                break;
            case "-l":
                video.diminuisciLuminosita();
                break;
            case "+v":
                video.alzaVolume();
                break;
            case "-v":
                video.abbassaVolume();
                break;
        }
        video.play();
    }

    private static void modificaRegistrazioneAudio(RegistrazioneAudio audio, Scanner scanner) {
        System.out.println("Aumentare volume (+) o diminuire (-)?");
        String scelta = scanner.nextLine();
        if ("+".equals(scelta)) {
            audio.alzaVolume();
        } else if ("-".equals(scelta)) {
            audio.abbassaVolume();
        }
        audio.play();
    }
}
///////////////////// MI ANDAVANO GLI ! E ORA NO MA ORMAI NON RIESCO PIU' A PENSARE :(


