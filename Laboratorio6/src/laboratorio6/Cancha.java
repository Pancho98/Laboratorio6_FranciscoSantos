
package laboratorio6;


public class Cancha extends Lugar {
    private String Categoria;
    private boolean Estado;

    public Cancha() {
        super();
    }

    public Cancha(String Categoria, boolean Estado, String Nombre, String Direccion, int Seguridad, int entrada, int salida) {
        super(Nombre, Direccion, Seguridad, entrada, salida);
        this.Categoria = Categoria;
        this.Estado = Estado;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
