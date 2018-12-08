
package modelo;

/**
 *
 * @author Leonardo
 */
public class Clientes {
    private String rut;
    private String nombre;
    private String apellido;

    public Clientes(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Clientes() {
    }

      
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Clientes{" + ", nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + '}';
    }
    
    
    
}
