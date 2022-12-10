/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author diego
 */
public class Cola {
    private Nodo3 frente;
    private Nodo3 ultimo;

    public Cola() {
    }
    
    public void encola(Solicitud solicitud,String categoria){
        Nodo3 newnode = new Nodo3(solicitud); 
        if(frente == null){  // significa que la cola esta vacia
            frente = newnode;
            ultimo = newnode;
        } else{
            ultimo.setAtras(newnode);
            ultimo=newnode;
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
    public void asignar(){
        
    }
}
