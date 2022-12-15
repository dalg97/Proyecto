package proyecto;

/**
 *
 * @author diego
 */
public class Nodo1 {
    //Atributos del nodo
    private Cliente cliente;
    private Nodo1 siguiente;
    
    public Nodo1(Cliente cliente){
        this.cliente = cliente;
    }
    //Setters and Getters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Nodo1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1 siguiente) {
        this.siguiente = siguiente;
    }
}
