/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author Martha Cecilia Lizcano
 */
public class CtlCandidato {
    
    MdlCandidato modeloCandidato;
    //creo constructor por defecto

    public CtlCandidato() {
        this.modeloCandidato= new MdlCandidato();
    }
        
    public ClsMensaje agregarCandidato(ClsCandidato candidato){
        System.out.println(candidato); 
//colocar logicas de negocio con condicionales
       ClsMensaje respuesta = this.modeloCandidato.agregarCandidato(candidato);
       
        //debe ir logica que conecte a la base de datos y suministre la informacion
        return respuesta;
      
    }
    
    public ClsMensaje ActualizarCandidato(ClsCandidato candidato) {

        ClsMensaje respuesta = this.modeloCandidato.ActualizarCandidato(candidato);
        return respuesta;
    }
    
    public ClsMensaje EliminarCandidato(String candidato) {
        ClsMensaje respuesta = this.modeloCandidato.EliminarCandidato(candidato);
        return respuesta;
    }
    
    public LinkedList<ClsCandidato> ObtenerCandidatos() {
        return this.modeloCandidato.ObtenerCandidatos();
        
    } 
    

}

        

