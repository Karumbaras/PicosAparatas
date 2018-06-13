package lt.vcs.andrius.PicosAparatoInterfaces;

public class Produktai {

    private double suris;
    private double padas;
    private double padazas;
    private double desra;
    private double pomidorai;

    Object o = new Object();

    public Produktai(double suris, double padas, double padazas, double desra, double pomidorai) {
        this.suris = suris;
        this.padas = padas;
        this.padazas = padazas;
        this.desra = desra;
        this.pomidorai = pomidorai;
    }

    public double getSuris() {
        return suris;
    }

    public void setSuris(double suris) {
        this.suris = suris;
    }

    public double getPadas() {
        return padas;
    }

    public void setPadas(double padas) {
        this.padas = padas;
    }

    public double getPadazas() {
        return padazas;
    }

    public void setPadazas(double padazas) {
        this.padazas = padazas;
    }

    public double getDesra() {
        return desra;
    }

    public void setDesra(double desra) {
        this.desra = desra;
    }

    public double getPomidorai() {
        return pomidorai;
    }

    public void setPomidorai(double pomidorai) {
        this.pomidorai = pomidorai;
    }

    public void addProduktai(Produktai another){
        this.setDesra(this.getDesra() + another.getDesra());
        this.setPadas(this.getPadas() + another.getPadas());
        this.setPadazas(this.getPadazas() + another.getPadazas());
        this.setPomidorai(this.getPomidorai() + another.getPomidorai());
        this.setSuris(this.getSuris() + another.getSuris());
    }

    public void subsctractProduktai(Produktai another){
        this.setDesra(this.getDesra() - another.getDesra());
        this.setPadas(this.getPadas() - another.getPadas());
        this.setPadazas(this.getPadazas() - another.getPadazas());
        this.setPomidorai(this.getPomidorai() - another.getPomidorai());
        this.setSuris(this.getSuris() - another.getSuris());
    }

    @Override
    public String toString() {
        return "Produktai{" +
                "suris=" + suris +
                ", padas=" + padas +
                ", padazas=" + padazas +
                ", desra=" + desra +
                ", pomidorai=" + pomidorai +
                '}';
    }




}
