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
    
    public void mostrar(int cedula){
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        String output="";
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            if(cedula == aux.getCliente().getCedula()){
                output += "| Nombre: "+aux.getCliente().getNombre()+" | "
                       + "Cedula: "+aux.getCliente().getCedula();
                aux = null;
            }else{
            aux = aux.getSiguiente(); }
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public void pop(){
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }
    
    public boolean search(int reference) {
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference == aux.getValor()) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    
    public void popModificado(int reference){
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            Nodo1 cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(reference != cima.getValor()){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                Nodo1 temp = new Nodo1();
                // Ingresa el value al node temporal.
                temp.setValor(cima.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimapPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimapPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getValor());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    }
}
