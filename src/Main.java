import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* RegistrazioneAudio radio = new RegistrazioneAudio("beat", 6, 4);
        System.out.println(radio.play());
        radio.abbassaVolume();
        radio.alzaVolume();
       Immagine picture = new Immagine("Foto1", "1920x1080", 5);
        System.out.println(picture.show());
        picture.diminuisciLum();
        picture.aumentaLum();
        picture.aumentaLum();
        Video youtube = new Video("k", 5, 6, 10);
        System.out.println(youtube.play());
        System.out.println(youtube.show());*/
        ElementoMultimediale[] arrayFiles = new ElementoMultimediale[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("ciao, scegli 5 oggetti multimediali tra immagini,video o audio da creare");
        for (int i = 0; i < 5; i++) {
            System.out.println("Scegli il tipo di file multimediale (audio, video, immagini):");
            String tipoFile = scanner.nextLine().toLowerCase();
            switch (tipoFile) {
                case "audio":
                    System.out.println("Hai scelto audio, inserisci un titolo per l'audio:");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Ora inserisci il volume iniziale:");
                    int volumeAudio = scanner.nextInt();
                    System.out.println("Ora inserisci la durata iniziale:");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    arrayFiles[i] = new RegistrazioneAudio(titoloAudio, volumeAudio, durataAudio);
                    System.out.println("Traccia audio creata!");
                    break;
                case "video":
                    System.out.println("Hai scelto video, inserisci un titolo per il video:");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Ora inserisci il volume iniziale:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Ora inserisci la durata iniziale:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Ora inserisci la luminosità iniziale:");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();
                    arrayFiles[i] = new Video(titoloVideo, volumeVideo, durataVideo, luminositaVideo);
                    System.out.println("Video creato!");
                    break;
                case "immagini":
                    System.out.println("Hai scelto immagini, inserisci un titolo per l'immagine:");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("Ora inserisci la risoluzione dell'immagine:");
                    String risoluzioneImmagine = scanner.nextLine();
                    System.out.println("Ora inserisci la luminosità iniziale:");
                    int luminositaImmagine = scanner.nextInt();
                    scanner.nextLine();
                    arrayFiles[i] = new Immagine(titoloImmagine, risoluzioneImmagine, luminositaImmagine);
                    System.out.println("Immagine creata!");
                    break;
                default:
                    System.out.println("Controlla che tu abbia scritto bene il tipo di file multimediale.");
                    i--; // decrementa l'indice per ripetere la scelta
                    break;
            }
        }


    }
}