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
    @Override
    public String toString() {
        return "Solicitud: \n"+"Cedula: "+solicitud.getCedula()+
                " | Fecha: "+solicitud.getFecha()+" | Dias: "+solicitud.getDias()+
                " | Estado: "+solicitud.getEstado()+" | Pasajeros: "+
                solicitud.getPasajeros()+" | Marca: "+solicitud.getMarca()+
                " | Modelo: "+solicitud.getModelo()+" | Extras: "+
                solicitud.getExtras()+" | Categoria: "+solicitud.getCategoria()+
                " | Precio: "+solicitud.getPrecio()+"\n";
    }
}
