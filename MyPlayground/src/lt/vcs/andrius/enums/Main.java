package lt.vcs.andrius.enums;

import java.util.Scanner;

public class Main {




    public static void plaukKia(Automobilis auto) {
        if (auto.marke.toUpperCase().equals("")) {
            System.out.println("Nuplautas");
        } else {
            System.out.println("Neplausim!");
        }
    }

    public static Automobilis kurkAutomobili(AutoTypes marke) {

        switch (marke) {
            case KIA:
                return new Automobilis(5, 6666, "KIA");

            case BMW:
                return new Automobilis(5, 1400, "BMW");

            case HONDA:
                return new Automobilis(5, 1234, "HONDA");

            default:
                return null;
        }
    }


    public static void main(String argv[]) {

        kurkAutomobili(AutoTypes.BMW);


        System.out.println(AutoTypes.BMW.arRodoPosukius());
        System.out.println(AutoTypes.HONDA.arRodoPosukius());




    }


}


class Automobilis {
    public int ratuSkaicius;
    public int svoris;
    public String marke;

    public Automobilis(int ratuSkaicius, int svoris, String marke) {
        this.ratuSkaicius = ratuSkaicius;
        this.svoris = svoris;
        this.marke = marke;
    }
}


enum AutoTypes{
    BMW(false), RENAULT(false), KIA(true), HONDA(false);

    boolean arRodo;
    AutoTypes(boolean arRodo){
        this.arRodo = arRodo;
    }


    public boolean arRodoPosukius(){
        return arRodo;
    }

}
