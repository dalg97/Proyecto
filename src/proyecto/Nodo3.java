/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author diego
 */
public class Nodo3 {
    //Atributos del node3
    private Solicitud solicitud;
    private Nodo3 next;
    private Nodo3 back;
    
    //Constructor
    public Nodo3(Solicitud solicitud){
        this.solicitud = solicitud;
    }
    
    //Setters and Getters
    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Nodo3 getNext() {
        return next;
    }

    public void setNext(Nodo3 next) {
        this.next = next;
    }

    public Nodo3 getBack() {
        return back;
    }

    public void setBack(Nodo3 back) {
        this.back = back;
    } 
}
