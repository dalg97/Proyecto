/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author diego
 */
public class Nodo2 {

    //Atributos del Nodo
    private Vehiculo vehiculo;
    private Nodo2 next;
    private Nodo2 atras;

    @Override
    public String toString() {
        return "Carro{" + "vehiculo=" + vehiculo.getMarca() + '}';
    }

    //Setters and Getters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Nodo2 getNext() {
        return next;
    }

    public void setNext(Nodo2 next) {
        this.next = next;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Nodo2 getAtras() {
        return atras;
    }

    public void setAtras(Nodo2 atras) {
        this.atras = atras;
    }

    public Nodo2(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
