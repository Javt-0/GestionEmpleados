
package dominio;

/**
 *
 * @author jonat
 */
public class Empleado extends Persona{
    private String numSeg;

    public String getNumSeg() {
        return numSeg;
    }

    public void setNumSeg(String numSeg) {
        this.numSeg = numSeg;
    }

    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Numero de seguridad social: " + numSeg;
    }
    
}
