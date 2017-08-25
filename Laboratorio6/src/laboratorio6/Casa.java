
package laboratorio6;


public class Casa extends Lugar{

    public Casa() {
    }

    public Casa(String Nombre, String Direccion, int Seguridad, int entrada, int salida) {
        super(Nombre, Direccion, Seguridad, entrada, salida);
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
