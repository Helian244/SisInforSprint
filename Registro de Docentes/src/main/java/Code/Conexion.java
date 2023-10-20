package Code;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "9g2sxMUcSaEiQb6aITcN";
    String bd = "railway";
    String ip = "containers-us-west-84.railway.app";
    String puerto = "5790";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: " + e.toString());
        }
        return conectar;
    }
    
    public void cerrarConexion() {
        if (conectar != null) {
            try {
                conectar.close();
            } catch (Exception e) {
                // Manejar el error de cierre de conexión, si es necesario
            }
        }
    }
}

