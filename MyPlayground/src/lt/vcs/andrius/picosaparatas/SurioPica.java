package lt.vcs.andrius.picosaparatas;

import lt.vcs.andrius.PicosAparatoInterfaces.Pica;
import lt.vcs.andrius.PicosAparatoInterfaces.Produktai;

public class SurioPica extends Pica {

    public SurioPica() {
        super(new AndriausReceptas(), 10);
        super.getReceptas().setDydis(5);
        super.getReceptas().setPavadinimas("surio");
        super.getReceptas().setProduktai(new Produktai(10, 1, 1, 1, 1));
    }

    @Override
    public String getPavadinimas() {
        return getReceptas().getPavadinimas();
    }

    public String toString() {
        return super.getReceptas().getPavadinimas() + "-" + getDydis();
    }

}
