package lt.vcs.andrius.PicosAparatoInterfaces;

public abstract class Pica {

    private Receptas receptas;
    private int dydis;

    public Pica(Receptas receptas, int dydis){
        this.receptas = receptas;
        this.dydis = dydis;
    }

    public Receptas getReceptas() {
        return receptas;
    }

    public int getDydis(){
        return dydis;
    }

    public abstract String getPavadinimas();

    public String toString(){
        return "Pica: " + getClass().getName();
    }
}

