/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Martha Cecilia Lizcano
 */
public class Clsjdbc {
   String driver = "com.mysql.cj.jdbc.Driver";
   String usuario = "root";
   String contraseña = "";
   String bd = "bd_elecciones_g10martha";
   String url = "jdbc:mysql://localhost:3306/" + this.bd;
   
   public Connection conexion;
   //se coloca publico para poder acceder de Mdl conexion
   
    public void CrearConexion() {
        try {
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url,usuario,contraseña);
            if(this.conexion !=null);
            //para saber que no se hizo conexion si es diferente quiere decir que si se hizo
            System.out.println("conexion exitosa");
        }catch(Exception error){
            System.out.println("Ocurrio un error:" +error.getMessage());
        }
        
     
              
     
}

}