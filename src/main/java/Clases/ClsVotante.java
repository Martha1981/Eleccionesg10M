/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Martha Cecilia Lizcano
 */
public class ClsVotante extends ClsPersonas {
   private String ciudadOrigen;

    public ClsVotante(String ciudadOrigen, String numeroDocumento, String nombre, String Telefono, String correo) {
        super(numeroDocumento, nombre, Telefono, correo);
        this.ciudadOrigen = ciudadOrigen;
    }    
    
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
   
   

    
    
}
