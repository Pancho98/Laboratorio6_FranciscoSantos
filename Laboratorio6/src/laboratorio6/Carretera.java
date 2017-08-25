
package laboratorio6;


public class Carretera {
    private int carretera;
    private double distancia;
    private String Inicio;
    private String Final;

    public Carretera() {
    }

    public Carretera(int carretera, double distancia, String Inicio, String Final) {
        this.carretera = carretera;
        this.distancia = distancia;
        this.Inicio = Inicio;
        this.Final = Final;
    }

    public int getCarretera() {
        return carretera;
    }

    public void setCarretera(int carretera) {
        this.carretera = carretera;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }

    @Override
    public String toString() {
        return "Carretera{" + "carretera=" + carretera + ", distancia=" + distancia + ", Inicio=" + Inicio + ", Final=" + Final + '}';
    }
    
    
}
