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
    //Atributos de pila
    private Nodo1 cima;
    private int largo;
    private String array [] = new String [4];
    
    public boolean Vacia(){ return cima == null;}
    
    //metodo agregar cliente a la pila
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
    //metodo para mostrar un usuario en especifico
    public void mostrarEspecifico(int cedula){
        // Se crea un nodo temp.
        Nodo1 aux = cima;
        String output="";
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            if(cedula == aux.getCliente().getCedula()){
                output += "| Nombre: "+aux.getCliente().getNombre()+" | "
                       + "Cedula: "+aux.getCliente().getCedula()+ " | "+
                        "Categoria: "+aux.getCliente().getCategoria();
                aux = null;
            }else{
            aux = aux.getSiguiente(); }
        }
        JOptionPane.showMessageDialog(null,output);
    }
    //metodo para mostrar la categoria de un cliente
    public String mostrarCategoria(int cedula){
        // Se crea un nodo temp
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
    //Mostrar todos los clientes
    public void mostrarTotal(){
        // Se crea un nodo temp.
        Nodo1 aux = cima;
        String output="";
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            output += " Nombre: "+aux.getCliente().getNombre()+" | "
                    + "Cedula: "+aux.getCliente().getCedula()+" | "+
                    "Categoria: "+aux.getCliente().getCategoria()+"\n";
           // System.out.println(output);
            aux = aux.getSiguiente(); 
        }
        JOptionPane.showMessageDialog(null,output);
    }
    //Metodo para sacar el nodo de la pila
    public void pop(){
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
            System.out.println("Largo: "+largo);
        }
    }
    //obtener los atributos del array
    public String[] getArray() {
        return array;
    }
    //metodo para ver si existe el cliente
    public boolean search(int Cedula) {
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual al cliente
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
    //obtener los atributos ya seteados
    public void getAtributos(int Cedula){
        Nodo1 aux = cima;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (aux != null) {
            // Compara si el value del node es igual que a la cedula
            if (Cedula == aux.getCliente().getCedula()) {
                // agregar valores al array
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
    //metodo modificar clientes
    public void modificar(int Cedula,String Categoria,String Fecha,String Correo,
            String Nombre) {
        // Crea una copia de la pila.
        Nodo1 aux = cima;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while ( aux != null) {
            // Compara si el value del node es igual que a la cedula
            if (Cedula == aux.getCliente().getCedula()) {
                // setear nuevos valores
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
        JOptionPane.showMessageDialog(null,
                "Usuario Modificado");
    }
    //metodo para subir de categoria
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
    //Metodo para eliminar clientes
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
