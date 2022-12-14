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
public class Cola {
    private Nodo3 frente;
    private Nodo3 ultimo;

    public Cola() {
    }
    
    public void encola(Solicitud solicitud){
        Nodo3 newnode = new Nodo3(solicitud); 
        if(frente == null){  // significa que la cola esta vacia
            frente = newnode;
            ultimo = newnode;
        }else if(solicitud.getCategoria() == "Zafiro"){
            Nodo3 aux = frente;
            frente = newnode;
            frente.setAtras(aux);
        }else if(solicitud.getCategoria() == "Oro" && 
                frente.getSolicitud().getCategoria() != "Zafiro"){
            Nodo3 aux = frente;
            frente = newnode;
            frente.setAtras(aux);
        }else if(solicitud.getCategoria() == "Oro" && 
                frente.getSolicitud().getCategoria() == "Zafiro"){
            Nodo3 aux = frente;
            Nodo3 temp = frente.getAtras();
            newnode.setAtras(temp);
            frente.setAtras(newnode);
        }else if(frente.getSolicitud().getCategoria() == "Bronce"){
            Nodo3 aux = frente;
            frente = newnode;
            frente.setAtras(aux);
        }else if(solicitud.getCategoria() == "Plata"){
            Nodo3 aux = frente;
            Nodo3 temp;
            while(aux != null){
                if(aux.getAtras().getSolicitud().getCategoria() == "Bronce"){
                    temp = aux.getAtras();
                    aux.setAtras(newnode);
                    newnode.setAtras(temp);
                    aux = null;
                }else{
                aux = aux.getAtras();
                }
            }
        }else{
            ultimo.setAtras(newnode);
            ultimo=newnode;
        }
    }
    
    public void SubirCategoria(int cedula,String Categoria){
        Nodo3 aux = frente;
        while(aux != null){
            if(cedula == aux.getSolicitud().getCedula()){
                aux.getSolicitud().setCategoria(Categoria);
                aux = null;
            }else{
            aux = aux.getAtras(); }
        }
    }
    public Nodo3 atiende(){
        Nodo3 aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    
    public boolean buscar(int Cedula){
        boolean exist = false;
        Nodo3 aux = frente;
        while(aux!=null){
            if(Cedula == aux.getSolicitud().getCedula()){
                exist=true;
                aux = null;
            }else {
                aux.getAtras();
            }
        }
        return exist;
    }
    
    @Override
    public String toString(){
        String s="";
        Nodo3 aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
    public String asignar(){
        Nodo3 aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
            
        }
        return "";
    }
}
