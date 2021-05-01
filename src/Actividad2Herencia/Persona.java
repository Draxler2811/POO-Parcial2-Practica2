/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2Herencia;

/**
 *
 * @author ol196
 */
public  abstract class Persona implements Acciones{
    protected String Direccion;
    protected String Nombre;

    public Persona() {
    }

    @Override
    public abstract void setDireccion(String Direccion);

    @Override
    public abstract String getDireccion();

    @Override
    public abstract void setNombre(String edad);

    @Override
    public abstract String getNombre();

  
}
