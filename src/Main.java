import multimedia.*; // per impoortarmi TUTTE le clssi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

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
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci il volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new MiaRegistrazioneAudio(titolo, volume);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, luminositaVideo, volumeVideo);
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
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                }
            }
        } while (scelta != 0);

        scanner.close();
    }
}


