/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Pila {
    private Nodo1 cima;
    private int largo;
    
    public boolean Vacia(){ return cima == null;}
    
    public void push(Cliente cliente){
        Nodo1 newNode = new Nodo1(cliente);
                
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }
    
    public void mostrar(){
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        String output="";
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            output += "| Nombre: "+aux.getCliente().getNombre()+" | "
                       + "Cedula: "+aux.getCliente().getCedula();
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null,output);
    }
    
}
