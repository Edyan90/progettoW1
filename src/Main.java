import entities.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio radio = new RegistrazioneAudio("beat", 6, 4);
        System.out.println(radio.play());
        radio.abbassaVolume();
        radio.alzaVolume();
    }
}