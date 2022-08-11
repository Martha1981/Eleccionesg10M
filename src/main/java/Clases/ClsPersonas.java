/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Martha Cecilia Lizcano
 */
public class ClsPersonas {
//Crear Atributos
private String numeroDocumento;
private String nombre;
private String Telefono;
private String correo;
// crear constructor

    public ClsPersonas(String numeroDocumento, String nombre, String Telefono, String correo) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.correo = correo;
        
   // get and set     
        
   }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}