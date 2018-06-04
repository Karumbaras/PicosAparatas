package lt.vcs.andrius.interfaces;

public class Kompiuteris implements Autorizacija{

    private String vartotojas;
    private String slaptazodis;

    private String leidziamasSlaptazodis = "labaislaptasirgalingasslaptazodis2";


    @Override
    public boolean arPrisijunges(String vartotojas) {
        if(this.vartotojas != null && this.vartotojas.equals(vartotojas)){
            return true;
        }
        return false;
    }

    @Override
    public boolean prisijunk(String vartotojas, String slaptazodis) {
        if(leidziamasSlaptazodis.equals(slaptazodis)){
            // authorize
            this.vartotojas = vartotojas;
            return true;
        }
        return false;
    }

    @Override
    public boolean atsijunk(String vartotojas) {
        this.vartotojas = "";
        return true;
    }


    public void sudek(int a, int b){
        System.out.println("Rezultatas: " + (a+b));
    }

}
