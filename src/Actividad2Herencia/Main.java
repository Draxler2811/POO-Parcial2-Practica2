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
public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.setDireccion("San juanl de bosque");
        cliente.setNombre("Omar");
        
        System.out.println("Mi direccion es:" + cliente.getDireccion());
        System.out.println("Mi nombre es: " + cliente.getNombre());
    }
}
