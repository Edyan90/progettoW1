package entities;

import Interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private String risoluzione;
    private int luminosita;

    public Immagine(String _titolo, String _risoluzione, int _luminosita) {
        super(_titolo);
        this.risoluzione = _risoluzione;
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
}
