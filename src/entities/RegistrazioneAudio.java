package entities;

import Interfaces.Riproduzione;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproduzione {
    private int volume;
    private int durata;


    public RegistrazioneAudio(String _titolo, int _volume, int _durata) {
        super(_titolo);
        this.volume = _volume;
        this.durata = _durata;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String play() {
        String result = "";
        for (int i = 0; i < durata; i++) {
            result += titolo;
        }
        for (int i = 0; i < volume; i++) {
            result += "!";
        }
        return result;
    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
        System.out.println("volume attuale: " + this.volume);
    }

    @Override
    public void alzaVolume() {

        this.volume++;
        System.out.println("volume attuale: " + this.volume);
    }
}
