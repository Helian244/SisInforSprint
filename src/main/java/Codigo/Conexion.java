/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "9g2sxMUcSaEiQb6aITcN";
    String bd = "railway";
    String ip = "containers-us-west-84.railway.app";
    String puerto = "5790";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection establecerConexion(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: " + e.toString());
        }
        return conectar;
    }
}
