/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author Martha Cecilia Lizcano
 */
public class ClsCandidato extends ClsPersonas {
//Crear Atributos
   private String partidoPolitico;
   private String descripcion;
   private String mensajeCampania;
   private String ciudadOrigen;
   private LinkedList<String> propuestas;

    public ClsCandidato(String partidoPolitico, String descripcion, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.partidoPolitico = partidoPolitico;
        this.descripcion = descripcion;
        this.mensajeCampania = mensajeCampania;
        this.ciudadOrigen = ciudadOrigen;
        this.propuestas = propuestas;
        
              
    }

                  
    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getCiudadDeOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadDeOrigen(String ciudadDeOrigen) {
        this.ciudadOrigen = ciudadDeOrigen;
    }

    public LinkedList<String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<String> propuestas) {
        this.propuestas = propuestas;
    }


    
}
