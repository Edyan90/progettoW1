package entities;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String _titolo, int _luminosita) {
        super(_titolo);
        this.luminosita = _luminosita;

    }
}
