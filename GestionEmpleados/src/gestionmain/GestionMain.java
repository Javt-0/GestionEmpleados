
package gestionmain;
import com.empresa.accesodatos.IAccesoDatos;
import com.empresa.accesodatos.ImplMongo;
import com.empresa.accesodatos.ImplMysql;
import dominio.Persona;
import dominio.Empleado;
        
/**
 *
 * @author jonat
 */
public class GestionMain {
    public static int cont;
    public static void main(String[] args) {
        Empleado p1 = new Empleado("Jonathan", "Aguilar");
        System.out.println(p1);
        
        //Instanciacion de la
        IAccesoDatos datosMysql = new ImplMysql();
        IAccesoDatos datosMongo = new ImplMongo();
        
        datosMysql.listar();
        datosMongo.listar();
    }
}
