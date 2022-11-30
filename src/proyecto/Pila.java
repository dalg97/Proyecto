/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author diego
 */
public class Pila {
    private Nodo1 cima;
    private int largo;
    
    public boolean Vacia(){ return cima == null;}
    
    public void push(Clientes cliente){
        Nodo1 newNode = new Nodo1();
        newNode.setValor(valor);
        
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }
    
}
