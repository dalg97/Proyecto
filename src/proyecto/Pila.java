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
    private String array [] = new String [4];
    
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

    public String[] getArray() {
        return array;
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
    public void getAtributos(int Cedula){
        Nodo1 aux = cima;
        // Bandera para verificar si exist el elemento a search.
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (Cedula == aux.getCliente().getCedula()) {
                // Cambia el value de la bandera.
                array[0] = aux.getCliente().getCategoria();
                array[1] = aux.getCliente().getCorreo();
                array[2] = aux.getCliente().getFecha();
                array[3] = aux.getCliente().getNombre();
                aux = null;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
    }
    public void modificar(int Cedula,String Categoria,String Fecha,String Correo,
            String Nombre) {
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        // Bandera para verificar si exist el elemento a search.
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while ( aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (Cedula == aux.getCliente().getCedula()) {
                // Cambia el value de la bandera.
                aux.getCliente().setCategoria(Categoria);
                aux.getCliente().setCorreo(Correo);
                aux.getCliente().setFecha(Fecha);
                aux.getCliente().setNombre(Nombre);
                aux=null;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        JOptionPane.showMessageDialog(null,
                "Usuario Modificado");
    }
    public void SubirCategoria(int cedula,String Categoria){
        Nodo1 aux = cima;
        while(aux != null){
            if(cedula == aux.getCliente().getCedula()){
                aux.getCliente().setCategoria(Categoria);
                aux = null;
            }else{
            aux = aux.getSiguiente(); }
        }
        JOptionPane.showMessageDialog(null,
                   "Usuario ha subido de Categoria");
    }
    
    public void popModificado(int Cedula){
        // Consulta si el value exist en la pila.
        if (search(Cedula)) {
            //Nodo1 aux = cima;
            Nodo1 aux = cima;  
            Nodo1 temp = aux;
            // Recorre la pila hasta el ultimo node.
            while(aux != null){
                if(Cedula == cima.getCliente().getCedula()){
                    pop();
                    aux = null;
                }else if(Cedula == aux.getCliente().getCedula()){
                    temp.setSiguiente(aux.getSiguiente());
                    aux = null;
                }else {
                        temp=aux;
                        aux=aux.getSiguiente();
                }
            }            
        }else{
            System.out.println("El Cliente no existe");
        }
    }
}
