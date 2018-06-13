package lt.vcs.andrius.picosaparatas;

import lt.vcs.andrius.PicosAparatoInterfaces.Produktai;
import lt.vcs.andrius.PicosAparatoInterfaces.Receptas;

public class AndriausReceptas implements Receptas {

    private Produktai receptoProduktai;
    private int picosDydis;
    private String pavadinimas;

    @Override
    public Produktai getSunaudotiniProduktai(int picosDydis) throws Exception {
        if(receptoProduktai == null || picosDydis == 0 || pavadinimas == null){
            System.err.println("Produktai, dydis arba pavadinimas neinicializuoti!");
            return null;
        }
        // TODO implement magic formula to calculate products
        System.err.println("Produktai neskaiciuojami!");
        if(true){
            throw new Exception("sugadinau!");
        }

        //
        return receptoProduktai;
    }

    @Override
    public void setProduktai(Produktai produktai) {
        this.receptoProduktai = produktai;
    }

    @Override
    public void setDydis(int dydis) {
        this.picosDydis = dydis;
    }

    @Override
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String getPavadinimas() {
        return pavadinimas;
    }
}
