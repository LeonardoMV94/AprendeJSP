
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Leonardo
 */
public class Conexion {
    //prueba de github
    public static String bd     =   "pruebabd";
    public static String login  =   "root";
    public static String pass   =   "";
    
    public static String url    =   "jdbc:mysql://localhost/" + bd;
    
    public static Connection conn; //realiza la conexion
    public static Statement sentencia; //camino de las consultas
    
    public static boolean buscarRut;
   
    public static Connection getConexion(){
      
        Connection conn = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, login, pass);
            System.out.println("Base de datos conectada!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo en conexion a BD", "Error", 0);
           
        }
      return conn;
    }
    public static void Desconectar() throws SQLException{
        conn.close();
        
    }
    
    
}

 
    /*public static void Conectar(){
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            conn = DriverManager.getConnection(url, login, pass);
            if (conn != null) {
                System.out.println("base de datos conectada!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fallo en conexion a BD", "Error", 0);
        }
    
        
    }
    */
