/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Clientes;
import sql.Conexion;
/**
 *
 * @author Leonardo
 */
public class Registro {
     
    
    public static boolean agregarCliente(Clientes cli){
        try {
            
            Connection conn = Conexion.getConexion();
            String query = "insert into clientes (rut,nombre,apellido)values(?,?,?)";
            PreparedStatement insertar = conn.prepareStatement(query);
            insertar.setString(1, cli.getRut());
            insertar.setString(2, cli.getNombre());
            insertar.setString(3, cli.getApellido());
            insertar.execute();
            insertar.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la BD " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en insertar " + e.getMessage());
            return false;
        }
        
    }
    
    
    public static void eliminarCliente(String rut)
    {
        try {
            Connection conn = Conexion.getConexion();
            String query = "delete from clientes where rut = ?";
            PreparedStatement eliminar = conn.prepareStatement(query);
            eliminar.setString(1, rut);
            eliminar.execute();
            eliminar.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Error en el metodo eliminar");
        }
    }
    
    public static void actualizarCliente(Clientes cli)
    {
        try {
            Connection conn = Conexion.getConexion();
            String query = "update clientes set nombre=?,apellido=? where rut = '"+cli.getRut()+"'";
            PreparedStatement actualizar = conn.prepareStatement(query);
        
            actualizar.setString(1, cli.getNombre());
            actualizar.setString(2, cli.getApellido());
            actualizar.execute();
            actualizar.close();
            conn.close();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Error en el metodo");
        }
    }
    
    public static void buscarCliente(Clientes cli)
    {
        
         
        try {
            Conexion.buscarRut = false;
            Connection conn = Conexion.getConexion();
            String query = "select * from clientes where rut = '"+cli.getRut()+"';";
            PreparedStatement buscar = conn.prepareStatement(query);
            ResultSet objRes = buscar.executeQuery();
            if (objRes.next()) {
                Conexion.buscarRut = true;
                cli.setRut(objRes.getString(1));
                cli.setNombre(objRes.getString(2));
                cli.setApellido(objRes.getString(3));
                
            }
            buscar.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Error metodo");
        }
    }
    public static String Verificar(){
        
        try {
           
            Connection conn = Conexion.getConexion();
            String query = "show status;";
            PreparedStatement ver = conn.prepareStatement(query);
            return "Conectada";
            
        } catch (Exception e) {
            return "Error Conexion";
        }
        
    }
    
    
}
