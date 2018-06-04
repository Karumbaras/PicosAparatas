package lt.vcs.andrius.interfaces;

public class Main {

    public static void patikrinkArPrisijunges(Autorizacija aut, String vardas){
        System.out.println(aut.arPrisijunges(vardas));
    }

    public static void main(String argv[]) {
        Autorizacija autorizacija = new Automobilis();



       // autorizacija = new Automobilis();


        patikrinkArPrisijunges(autorizacija, "abc");




      /*  Kompiuteris kompiuteris = (Kompiuteris)autorizacija;
        kompiuteris.sudek(6,8);

        Autorizacija autorizacija2 = kompiuteris;






        String vartotojas = "andrius";

        System.out.println(autorizacija.arPrisijunges(vartotojas));

        System.out.println(autorizacija.prisijunk(vartotojas, "labaislaptasirgalingasslaptazodis2"));
        System.out.println(autorizacija.arPrisijunges(vartotojas));*/

    }
}
