package cv04;

//kdyz je trida abstraktni, nelze vytvorit potomek ale je jen k dedeni
public abstract class Automobil implements Info, MotoroveVozidlo {
    @Override
    public String kdoJsem() {
        return "Automobil";
    }
    public abstract int pocetMist();
    public static String naCoJezdi(MotoroveVozidlo m){
        return m.naCoJezdim().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj instanceof MotoroveVozidlo mv){ //mv je rovnou pretypovani objektu
//            MotoroveVozidlo mv = (MotoroveVozidlo)obj;
//             return (this.naCoJezdim().equals(mv.naCoJezdim()) && this.mujMotor().equals(mv.mujMotor()); //jinak zapsano bez ==
            return ((this.naCoJezdim() == mv.naCoJezdim()) && (this.mujMotor() == mv.mujMotor()));
        }
        return false;
    }

    public static MotoroveVozidlo getVozidlo(Palivo palivo, TypMotoru typMotoru){
        /*class Vozidlo implements MotoroveVozidlo{
            @Override
            public Palivo naCoJezdim() {
                return palivo;
            }

            @Override
            public TypMotoru mujMotor() {
                return typMotoru;
            }
        }*/
//        return new Vozidlo();
        return new MotoroveVozidlo(){ //vytvoreni anonymni tridy
            @Override
            public Palivo naCoJezdim() {
                return palivo;
            }

            @Override
            public TypMotoru mujMotor() {
                return typMotoru;
            }
        };

    }
}
