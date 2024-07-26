import entities.Video;

public class Main {
    public static void main(String[] args) {
        /*RegistrazioneAudio radio = new RegistrazioneAudio("beat", 6, 4);
        System.out.println(radio.play());
        radio.abbassaVolume();
        radio.alzaVolume();
        Immagine picture = new Immagine("Foto1", "1920x1080", 5);
        System.out.println(picture.show());
        picture.diminuisciLum();
        picture.aumentaLum();
        picture.aumentaLum();*/
        Video youtube = new Video("k", 5, 6, 10);
        System.out.println(youtube.play());
        System.out.println(youtube.show());
    }
}