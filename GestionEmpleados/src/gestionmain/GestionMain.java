
package gestionmain;
import dominio.Persona;
        
/**
 *
 * @author jonat
 */
public class GestionMain {
    public static int cont;
    public static void main(String[] args) {
        Persona p1 = new Persona("Jonathan", "Aguilar");
        Persona p2 = new Persona("Ingrid", "Ayala");
        System.out.println(p1);
    }
}
