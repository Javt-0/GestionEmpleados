
package dominio;

import java.io.Serializable;

/**
 *
 * @author jonat
 */
public class Persona implements Serializable{
    //Atributos
    private String nombre;
    private String apellido;
    private int id;
   
    //Constructor
    public Persona() {
        
    }

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.id == other.id;
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
