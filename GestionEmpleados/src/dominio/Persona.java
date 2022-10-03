
package dominio;
import gestionmain.GestionMain ;
/**
 *
 * @author jonat
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int id;
   
    //Constructor
    public Persona() {
        GestionMain.cont ++;
        id = GestionMain.cont;
    }

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Set y Get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
  
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id);
        sb.append(" ").append(nombre);
        sb.append(" ").append(apellido);
        return sb.toString();
    }
}
