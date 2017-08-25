
package laboratorio6;


public class Lugar {
    public String Nombre;
    private String Direccion;
    private int Seguridad;
    private int entrada;
    private int salida;

    public Lugar() {
    }

    public Lugar(String Nombre, String Direccion, int Seguridad, int entrada, int salida) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Seguridad = Seguridad;
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getSeguridad() {
        return Seguridad;
    }

    public void setSeguridad(int Seguridad) {
        this.Seguridad = Seguridad;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
