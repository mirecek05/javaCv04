package cv04;

public enum Palivo {
    BENZIN(95), NAFTA(55), LPG(105), CNG(125);

    private int octCetCislo;

    Palivo(int octCetCislo) {
        this.octCetCislo = octCetCislo;
    }

    public int getOctCetCislo() {
        return octCetCislo;
    }
}
