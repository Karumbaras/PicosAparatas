package lt.vcs.andrius.PicosAparatoInterfaces;

public interface Receptas {
    public Produktai getSunaudotiniProduktai(int picosDydis);

    public void setProduktai(Produktai produktai);

    public void setDydis(int dydis);

    public void setPavadinimas(String pavadinimas);

    public String getPavadinimas();

}
