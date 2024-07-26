package entities;

import Interfaces.Luminosita;
import Interfaces.Riproduzione;

public class Video extends ElementoMultimediale implements Riproduzione, Luminosita {
    private int volume;
    private int durata;
    private int luminosita;

    public Video(String _titolo, int _volume, int _durata, int _luminosita) {
        super(_titolo);
        this.volume = _volume;
        this.durata = _durata;
        this.luminosita = _luminosita;
    }

    @Override
    public String show() {
        String result = "";

        for (int i = 0; i < luminosita; i++) {
            result += "* \n";
        }
        return titolo + result;
    }

    @Override
    public void diminuisciLum() {
        if (this.luminosita > 0) {
            this.luminosita--;
        }
        System.out.println("luminosità attuale: " + this.luminosita);
    }

    @Override
    public void aumentaLum() {
        this.luminosita++;
        System.out.println("luminosità attuale: " + this.luminosita);
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
