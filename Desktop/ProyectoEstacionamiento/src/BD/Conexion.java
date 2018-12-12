
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author grupo
 */
public class Conexion {
    
    
    public static String bd     =   "estacionamiento";
    public static String login  =   "root";
    public static String pass   =   "";
    
    public static String url    =   "jdbc:mysql://localhost/" + bd;
    
    public static Connection conn; //realiza la conexion
    public static Statement sentencia; //camino de las consultas
    
    public static boolean buscarPatente;
   
    public static Connection getConexion(){
    
           
        Connection conn = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, login, pass);
            System.out.println("Base de datos conectada!!");
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        }
      return conn;
    }
    
    
    public static void Desconectar() throws SQLException{
        conn.close();
    }
    
    
}
