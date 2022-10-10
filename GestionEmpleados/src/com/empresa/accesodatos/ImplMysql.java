/*
 * esta clase implementa las operaciones de acceso a datos de Mysql
 */
package com.empresa.accesodatos;
/**
 *
 * @author jonat
 */
public class ImplMysql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde MySql");
    }

    @Override
    public void listar() { 
        System.out.println("Listando desde MySql");
    }

    @Override
    public void actualizar() { 
        System.out.println("Actualizando desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde MySql");
    }
    
}
