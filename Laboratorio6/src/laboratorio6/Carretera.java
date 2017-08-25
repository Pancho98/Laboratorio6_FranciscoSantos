
package laboratorio6;


public class Carretera {
    private int codigo;
    private double distancia;
    private String Inicio;
    private String Final;

    public Carretera() {
    }

    public Carretera(int codigo, double distancia, String Inicio, String Final) {
        this.codigo = codigo;
        this.distancia = distancia;
        this.Inicio = Inicio;
        this.Final = Final;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "Carretera{" + "codigo=" + codigo + ", distancia=" + distancia + ", Inicio=" + Inicio + ", Final=" + Final + '}';
    }
    
    
}
