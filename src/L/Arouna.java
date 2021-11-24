package L;

public abstract class Arouna {

    public int IQ;
    public double größe;
    public int kraft;
    public String Haarfarbe;

    @Override
    public String toString() {
        return "Arouna{" +
                "IQ=" + IQ +
                ", größe=" + größe +
                ", kraft=" + kraft +
                ", Haarfarbe='" + Haarfarbe + '\'' +
                '}';
    }

    public Arouna(int IQ, double größe, int kraft, String haarfarbe) {
        this.IQ = IQ;
        this.größe = größe;
        this.kraft = kraft;
        Haarfarbe = haarfarbe;
    }


}
