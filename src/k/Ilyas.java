package k;

import L.Arouna;

public class Ilyas extends Arouna{

    @Override
    public String toString() {
        return "Ilyas{" +
                "IQ=" + IQ +
                ", größe=" + größe +
                ", kraft=" + kraft +
                ", Haarfarbe='" + Haarfarbe + '\'' +
                '}';
    }

    public Ilyas(int IQ, double größe, int kraft, String haarfarbe) {
        super(IQ, größe, kraft, haarfarbe);
    }
}
