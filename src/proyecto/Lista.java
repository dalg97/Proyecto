/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;


/**
 *
 * @author diego
 */
public class Lista {
    private Nodo2 cabeza;
    
    public void insertar(Vehiculo vehiculo) {
        if (cabeza == null) {
            //si la lista esta vacia, se inserta como la cabeza
            cabeza = new Nodo2(vehiculo);
            //si no esta vacia, verifica si el id es menor al id de la cabeza
        } else if (vehiculo.getAnio() < cabeza.getVehiculo().getAnio()) {
            //si es menor, crea el nodo temporal y lo asigna a la derecha
            //de la cabeza
            Nodo2 aux = new Nodo2(vehiculo);
            aux.setNext(cabeza);
            cabeza.setAtras(aux);
            //cabeza toma el valor del nodo temporal
            cabeza = aux;
            //si el siguiente nodo de la cabeza es nulo, se agrega el nuevo
            //nodo
        } else if (cabeza.getNext() == null) {
            Nodo2 aux = new Nodo2(vehiculo);
            cabeza.setNext(aux);
            aux.setAtras(cabeza);
        } else {
            //si no cumple con las anteriores, se crea el nodo temporal con 
            //el valor de la cabeza e ingresa al ciclo para recorrer la lista
            Nodo2 aux = cabeza;
            
            //si el id del siguiente nodo es mayor al id del nuevo nodo, este 
            //pasaria a ser el siguiente nodo
            while (aux.getNext() != null
                    && aux.getNext().getVehiculo().getAnio()
                    < vehiculo.getAnio()) {
                aux = aux.getNext();
            }
            //se crea un nodo temporal y se asinga como nodo siguiente.
            Nodo2 temp = new Nodo2(vehiculo);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            temp.setAtras(aux);
        }
    }
    
    public void modificar(Vehiculo vehiculo) {
        //Buscar el ID y ver si este existe
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            Nodo2 aux = cabeza; //utilizo aux como un buscador
            //La lista no puede estar vacía para poder obtener los 
            //datos exitentes y verificar que estos sean  menores al ID 
            while (aux != null && aux.getVehiculo().getAnio() < 
                    vehiculo.getAnio()) {
                aux = aux. getNext (); //Continuar con la busqueda
            }
            // Si el aux es diferente a nulo y se logran obtener los datos
            //siempre y cuando el ID exista se va a proceder a modificar el 
            //nombre
            if (aux != null && aux.getVehiculo().getAnio() == 
                    vehiculo.getAnio()){
                //Se obtienen los datos para cambiar el valor del nombre
                aux.getVehiculo().setEstado("Alquilado");
            }
        }
    }
    
    public void eliminar(String placa) { //definimos el metodo llamado elimina y 
        //ponemos como parametro el int id 
        //Lo que vamos a hacer es eliminar el id de una persona
       if (cabeza != null) {//Si la lista no esta nula entonces empieza a buscar
            if (cabeza.getVehiculo().getPlaca() == placa) {
            //buscamos el id utilizando un 
           //if statement y verificamos que la cabeza cumpla el parametro del id
                cabeza = cabeza.getNext(); //sino cumple como parametro, 
                //seguimos buscando y definimos el siguiente nodo como cabeza
            } else {
                Nodo2 aux = cabeza; //se utiliza el modo auxiliar 
                //Mientras el nodo no este vacío 
                //de la lista sea menor que el buscado
                while (aux.getNext() != null
                        && aux.getNext().getVehiculo().getPlaca() != placa) {
                    aux = aux.getNext();
                }
                //avanzo en la lista

                // si el que le sigue es mayor entonces para el ciclo 
                //y se ejecuta lo siguiente
                if (aux.getNext() != null
                        && aux.getNext().getVehiculo().getPlaca() == placa) {
                    //si el id es igual al del parametro...

                    aux.setNext(aux.getNext().getNext());
                    aux.getNext().getNext().setAtras(aux);
                   //y en este ultimo paso lo que hacemos es cambiar referencias
                }
            }
        }
    }
    
    @Override
    public String toString() {
        Nodo2 aux = cabeza;
        String s = "";
        while (aux != null) {
            s += aux + ", ";
            aux = aux.getNext();
        }
        return s;
    }
}
