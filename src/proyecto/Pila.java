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
    
    public void mostrarEspecifico(int cedula){
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
    
    public String mostrarCategoria(int cedula){
        // Crea una copia de la pila.
        Nodo1 aux = cima;
       String categoria="";
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            if(cedula == aux.getCliente().getCedula()){
                categoria = aux.getCliente().getCategoria();
                aux = null;
            }else{
            aux = aux.getSiguiente(); }
        }
        return categoria;
    }
    
    public void mostrarTotal(){
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        String output="";
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            output += " Nombre: "+aux.getCliente().getNombre()+" | "
                    + "Cedula: "+aux.getCliente().getCedula()+"\n";
           // System.out.println(output);
            aux = aux.getSiguiente(); 
        }
        JOptionPane.showMessageDialog(null,output);
    }
    
    public void pop(){
        if (!Vacia()) {
            System.out.println("Removing: "+cima.getCliente().getCedula());
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
            System.out.println("Largo: "+largo);
        }
    }
    
    public boolean search(int Cedula) {
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (Cedula == aux.getCliente().getCedula()) {
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
    public String search1(int Cedula) {
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        String test = "";
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            //System.out.println("Working on "+aux.getCliente().getCedula());
            if (Cedula == aux.getCliente().getCedula()) {
                // Cambia el value de la bandera.
                test = "Existe: "+aux.getCliente().getCedula();
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return test;
    }
    public void popModificado(int Cedula){
        // Consulta si el value exist en la pila.
        if (search(Cedula)) {
            //Nodo1 aux = cima;
            Nodo1 cimapPilaAux = null;
            // Recorre la pila hasta el ultimo node.
            while(Cedula != cima.getCliente().getCedula()){
                System.out.println("cedula es diferente");
                System.out.println("Cedula es: "+cima.getCliente().getCedula());
                Nodo1 temp = cima;
                //if(Cedula != cima.getCliente().getCedula()){
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
                //}
                pop();
                System.out.println("Removio el de la original");
                //aux = aux.getSiguiente(); 
            }
            pop();
            System.out.println("Removio el buscado");
            while(cimapPilaAux != null){
                System.out.println("Ingresan nodos a la pila original");
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getCliente());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    }
    public void popModificado1(int cedula){
        // Consulta si el value exist en la pila.
        if (search(cedula)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            Nodo1 cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(cima != null && cedula != cima.getCliente().getCedula()){
                System.out.println("Cedula es: "+cima.getCliente().getCedula());
                // Crea un node temporal para agregarlos a la pila auxiliar.
                Nodo1 temp = cima;
                // Ingresa el value al node temporal.
                //temp.setValor(cima.getValor());
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
                push(cimapPilaAux.getCliente());
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
