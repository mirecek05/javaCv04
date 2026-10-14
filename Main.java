package cv04;

public class Main {

    public static void main(String[] args){
        Info i =  new SkodaOctaviaCombi(Palivo.BENZIN, TypMotoru.ČTYŘTAKT, 5);
        //printInfo(i);
        System.out.println(i);
        Object o = new SkodaOctavia(Palivo.NAFTA, TypMotoru.ČTYŘTAKT, 6);
        System.out.println(o);
    }
    public static void printInfo(Info info){
        System.out.println(info.kdoJsem());
    }
}
