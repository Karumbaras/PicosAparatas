package lt.vcs.andrius.interfaces;

public interface Autorizacija {

    public boolean arPrisijunges(String vartotojas);

    public boolean prisijunk(String vartotojas, String slaptazodis);

    public boolean atsijunk(String vartotojas);
}
