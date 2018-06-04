package lt.vcs.andrius.picosaparatas;

import lt.vcs.andrius.PicosAparatoInterfaces.Pica;
import lt.vcs.andrius.PicosAparatoInterfaces.Produktai;

public class DesrosPica extends Pica {

    public DesrosPica(){
        super(new AndriausReceptas(), 10);
        super.getReceptas().setDydis(5);
        super.getReceptas().setPavadinimas("desros");
        super.getReceptas().setProduktai(new Produktai(1,1,1,10,1));
    }

    @Override
    public String getPavadinimas() {
        return getReceptas().getPavadinimas();
    }

    public String toString(){
        return super.getReceptas().getPavadinimas() + "-"+ getDydis();
    }
}
