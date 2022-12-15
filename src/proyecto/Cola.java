
package proyecto;

/**
 *
 * @author diego
 */
public class Cola {
    //Atributos de la Cola
    private Nodo3 frente;
    private Nodo3 ultimo;

    public Cola() {
    }
    //Metodo encolar
    public void encola(Solicitud solicitud){
        Nodo3 newnode = new Nodo3(solicitud); 
        if(frente == null){  // significa que la cola esta vacia
            frente = newnode;
            ultimo = newnode;
        }else if(solicitud.getCategoria() == "Zafiro"){
            //Si es Zafiro, lo agrega de primero
            Nodo3 aux = frente;
            frente = newnode;
            frente.setAtras(aux);
        }else if(solicitud.getCategoria() == "Oro" && 
                frente.getSolicitud().getCategoria() != "Zafiro"){
            //Si es Oro y la cabeza es diferente a Zafiro, se pone de primero
            Nodo3 aux = frente;
            frente = newnode;
            frente.setAtras(aux);
        }else if(solicitud.getCategoria() == "Oro" && 
                frente.getSolicitud().getCategoria() == "Zafiro"){
            //Si es oro y la cabeza es Zafiro, se agrega de segundo
            Nodo3 aux = frente;
            Nodo3 temp = frente.getAtras();
            newnode.setAtras(temp);
            frente.setAtras(newnode);
        }else if(frente.getSolicitud().getCategoria() == "Bronce"){
            //Si es Bronce es el frente, se pone de primero
            Nodo3 aux = frente;
            frente = newnode;
            frente.setAtras(aux);
        }else if(solicitud.getCategoria() == "Plata"){
            //Si es Plata ingresa a un ciclo para colocarlo al frente de bronce
            Nodo3 aux = frente;
            Nodo3 temp;
            while(aux != null){
                //Si es igual a bronce, bronce pasa de ultimo
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
    //Metodo para subir de categoria
    public void SubirCategoria(int cedula,String Categoria){
        Nodo3 aux = frente;
        while(aux != null){
            //recorrer la cola hasta encontrar el buscado
            if(cedula == aux.getSolicitud().getCedula()){
                aux.getSolicitud().setCategoria(Categoria);
                aux = null;
            }else{
            aux = aux.getAtras(); }
        }
    }
    //Metodo para atender la solicitud
    public Nodo3 atiende(){
        Nodo3 aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    //metodo para buscar si existe una solicitd
    public boolean buscar(int Cedula){
        boolean exist = false;
        Nodo3 aux = frente;
        while(aux!=null){
            //recorrer la cola hasta encontrar el buscado
            if(Cedula == aux.getSolicitud().getCedula()){
                exist=true;
                aux = null;
            }else {
                aux.getAtras();
            }
        }
        return exist;
    }
    //Override
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
    //Metodo para asignar un Vehiculo
    public String asignar(){
        Nodo3 aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);       
        }
        return "";
    }
}
