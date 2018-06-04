package lt.vcs.andrius.picosaparatas;

import lt.vcs.andrius.PicosAparatoInterfaces.*;

public class PicosAparatas implements IPicosAparatas {

    private Produktai produktai;

    public PicosAparatas(Produktai produktai) {
        this.produktai = produktai;
    }

    @Override
    public Pica gaminkPica(String pavadinimas, int dydis) {

        Pica pica = null;

        switch (pavadinimas) {
            case "desros":
                pica = new DesrosPica();
                break;
            case "surio":
                pica = new SurioPica();
                break;
            case "andriaus":
                pica = new AndriausPica();
                break;
            case "super":
                pica = new SuperPica(new AndriausReceptas(), 65);
                pica.getReceptas().setDydis(12);
                pica.getReceptas().setPavadinimas("SUPER");
                pica.getReceptas().setProduktai(new Produktai(10, 1, 1, 1, 1));
            default:
                System.err.println("Nera tokios picos");
        }

        // TODO validacija
        if(pica != null){
            this.produktai.subsctractProduktai(pica.getReceptas().getSunaudotiniProduktai(dydis));
            System.out.println("Pica pagaminta!");
        }

        return pica;
    }

    @Override
    public void papildykProduktus(Produktai produktai) {
        this.produktai.addProduktai(produktai);
        System.out.println("Papildžiau produktu!");
    }

    public Produktai getProduktai() {
        return produktai;
    }
}
