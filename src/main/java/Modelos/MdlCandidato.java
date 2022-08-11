/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Clases.Clsjdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Martha Cecilia Lizcano
 */
public class MdlCandidato {

    Clsjdbc jdbc;

    public MdlCandidato() {
        this.jdbc = new Clsjdbc();
        this.jdbc.CrearConexion();
    }

    public ClsMensaje agregarCandidato(ClsCandidato candidato) {
        //colocar procesos que el modelo permita insertar, actualizar, eliminar
        ClsMensaje mensaje = new ClsMensaje();
        try {
            /*    System.out.println(candidato.getNumeroDocumento());
            System.out.println(candidato.getNombre());
            System.out.println(candidato.getTelefono());
            System.out.println(candidato.getCorreo());
            System.out.println(candidato.getPartidoPolitico());
            System.out.println(candidato.getCiudadDeOrigen());
            System.out.println(candidato.getDescripcion());
            System.out.println(candidato.getMensajeCampania());
            System.out.println(candidato.getPropuestas());
            para probar si esta llegando la informacion
             */

            String sql = "INSERT INTO  tbl_candidato VALUES(?,?,?,?,?,?,?,?,NULL)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);

            sentencia.setString(1, candidato.getNumeroDocumento());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getCorreo());
            sentencia.setString(5, candidato.getPartidoPolitico());
            sentencia.setString(6, candidato.getCiudadDeOrigen());
            sentencia.setString(7, candidato.getDescripcion());
            sentencia.setString(8, candidato.getMensajeCampania());

            int resultado = sentencia.executeUpdate();
            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK,"Has creado un nuevo candidato");
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR,"error no encontrado");
            }
            return mensaje;
        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Exception:" + e.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje EliminarCandidato(String idCandidato) {

        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "DELETE FROM tbl_candidato WHERE id_candidato = ?";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, idCandidato);

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has eliminado al candidato: " + idCandidato);
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }

    
    
    public LinkedList<ClsCandidato> ObtenerCandidatos() {
        try {
            LinkedList<ClsCandidato> listaCandidatos = new LinkedList<>();
            String sql = "SELECT * FROM tbl_candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                String partidoPolitico = resultados.getNString("partido_politico");
                String descripcion = resultados.getNString("descripcion");
                String numeroDocumento = resultados.getNString("id_candidato");
                String nombre = resultados.getNString("nombre");
                String telefono = resultados.getNString("telefono");
                String correo = resultados.getNString("correo");

                ClsCandidato candi = new ClsCandidato(partidoPolitico, descripcion, numeroDocumento, nombre, telefono, correo);
                listaCandidatos.add(candi);
            }
            return listaCandidatos;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }

    public ClsMensaje ActualizarCandidato(ClsCandidato candidato) {
        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "UPDATE tbl_candidato SET nombre = ?, descripcion = ?, telefono = ?, mensajeCampania = ?,partidoPolitico = ?, where id_candidato = ?";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, candidato.getNombre());
            sentencia.setString(2, candidato.getDescripcion());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getNumeroDocumento());
            sentencia.setString(5, candidato.getMensajeCampania());
            sentencia.setString(4, candidato.getPartidoPolitico());
            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has editado al candidato: ");
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje; 

        }

    }


}

