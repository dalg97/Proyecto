/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author diego
 */
public class Cliente {
    private int Cedula;
    private String Nombre;
    private String Fecha;
    private String Correo;
    private String Categoria;
    
    public Cliente(int cedula,String nombre,String fecha,String correo,String
            categoria){
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Fecha = fecha;
        this.Correo = correo;
        this.Categoria = categoria;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCategoria() {
        return Categoria;
    }
    
}
