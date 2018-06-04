package lt.vcs.andrius.PicosAparatoInterfaces;

public class SuperPica extends Pica {


    public SuperPica(Receptas receptas, int dydis){
        super(receptas, dydis);
    }

    @Override
    public String getPavadinimas() {
        return "Super Pica!";
    }
}
