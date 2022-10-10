/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa.accesodatos;

/**
 *
 * @author jonat
 */
public class ImplMongo implements IAccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertando desde Mongo");
    }

    @Override
    public void listar() { 
        System.out.println("Listando desde Mongo");
    }

    @Override
    public void actualizar() { 
        System.out.println("Actualizando desde Mongo");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Mongo");
    }
}
