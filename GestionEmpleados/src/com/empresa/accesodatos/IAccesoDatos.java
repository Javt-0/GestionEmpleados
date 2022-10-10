
package com.empresa.accesodatos;

/**
 *
 * @author jonat
 */
public interface IAccesoDatos {
    int maxRegistros = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
