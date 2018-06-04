package lt.vcs.andrius.interfaces;

public class Automobilis implements Autorizacija{



    @Override
    public boolean arPrisijunges(String vartotojas) {
        return false;
    }

    @Override
    public boolean prisijunk(String vartotojas, String slaptazodis) {
        return "10010101011101010".equals(slaptazodis);
    }

    @Override
    public boolean atsijunk(String vartotojas) {
        return false;
    }

    public void vroom(){
        System.out.println("vroom!");
    }


}
