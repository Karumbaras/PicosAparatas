package lt.vcs.andrius.picosaparatas;

import lt.vcs.andrius.PicosAparatoInterfaces.Pica;
import lt.vcs.andrius.PicosAparatoInterfaces.Produktai;
import lt.vcs.andrius.PicosAparatoInterfaces.Receptas;

public class AndriausPica extends Pica {

    public AndriausPica(){
        super(new AndriausReceptas(), 10);
        super.getReceptas().setDydis(5);
        super.getReceptas().setPavadinimas("andriaus");
        super.getReceptas().setProduktai(new Produktai(5,5,5,5,5));
    }

    @Override
    public String getPavadinimas() {
        return getReceptas().getPavadinimas();
    }

    public String toString(){
        return super.getReceptas().getPavadinimas() + "-"+ getDydis();
    }
}
