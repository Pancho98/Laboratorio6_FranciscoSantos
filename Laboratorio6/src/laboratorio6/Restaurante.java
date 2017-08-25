
package laboratorio6;


public class Restaurante extends Lugar{
    private String Categoria;
    private int Popularidad;

    public Restaurante() {
        super();
    }

    public Restaurante(String Categoria, int Popularidad, String Nombre, String Direccion, int Seguridad, int entrada, int salida) {
        super(Nombre, Direccion, Seguridad, entrada, salida);
        this.Categoria = Categoria;
        this.Popularidad = Popularidad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getPopularidad() {
        return Popularidad;
    }

    public void setPopularidad(int Popularidad) {
        this.Popularidad = Popularidad;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
