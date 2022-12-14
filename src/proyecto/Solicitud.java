
package proyecto;

/**
 *
 * @author diego
 */
public class Solicitud {
    //Atributos de la solicitud
    private int cedula;
    private String fecha;
   // private String placa;
    private int dias;
    private String estado;
    private int pasajeros;
    private String marca;
    private String modelo;
    private String extras;
    private String categoria;
    private double precio;
    
    //Constructor
    public Solicitud(int cedula,String fecha,int dias,String estado,
            int pasajeros,String marca,String modelo,String extras,
            String categoria,double precio){
        this.cedula = cedula;
        this.fecha = fecha;
        this.dias = dias;
        this.estado = estado;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.extras = extras;
        this.categoria= categoria;
        this.precio = precio;
    }
    
    //Setters and Getters
    public int getCedula() {
        return cedula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
