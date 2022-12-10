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
    private Nodo3 atras;
    
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

    public Nodo3 getAtras() {
        return atras;
    }

    public void setAtras(Nodo3 atras) {
        this.atras = atras;
    }    
}
