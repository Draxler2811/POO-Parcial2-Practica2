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
public class Cliente extends Usuario  {

    @Override
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String getDireccion() {
        return Direccion;
        
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getNombre() {
    return Nombre;
    }
    
   
    
    
    
}
