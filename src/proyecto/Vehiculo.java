/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author diego
 */
public class Vehiculo {
    //Atributos del Vehiculo
    private String placa;
    private String marca;
    private int anio;
    private String color;
    private int cilidrada;
    private String combustible;
    private int pasajeros;
    private int precio;
    private String extras;
    private String estado;
    
    //Constructor
    public Vehiculo(String placa,String marca,int anio,String color,
            int cilindrada,String combustible,int pasajeros,int precio,
            String extras,String estado){
            this.placa = placa;
            this.marca = marca;
            this.anio = anio;
            this.color = color;
            this.cilidrada = cilindrada;
            this.combustible = combustible;
            this.pasajeros = pasajeros;
            this.precio = precio;
            this.extras = extras;
            this.estado = estado;
    }
    //Setters and Getters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }  
    
     @Override
    public String toString(){
        return "Vehiculo{" + "Placa="+placa+", Anio="+anio+", Marca="+marca+'}';
    }
}
