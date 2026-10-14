package cv04;

public class SkodaOctavia extends Automobil{
    private Palivo palivo;
    private TypMotoru typMotoru;
    private int pocatMist;

    public SkodaOctavia(Palivo palivo, TypMotoru typMotoru, int pocatMist) {
        this.palivo = palivo;
        this.typMotoru = typMotoru;
        this.pocatMist = pocatMist;
    }

    @Override
    public int pocetMist() {
        return pocatMist;
    }

    @Override
    public Palivo naCoJezdim() {
        return palivo;
    }

    @Override
    public TypMotoru mujMotor() {
        return typMotoru;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "palivo=" + palivo +
                ", typMotoru=" + typMotoru +
                ", pocatMist=" + pocatMist +
                '}';
    }
}
