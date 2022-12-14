
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 * @author danny
 */
public class Lista {

    private Nodo2 cabeza;
    //private Nodo2 ultimo;
    private String array [] = new String [10];

    public void insertar(Vehiculo vehiculo) {
        if (cabeza == null) {
            //si la lista esta vacia, se inserta como la cabeza
            cabeza = new Nodo2(vehiculo);
           // ultimo = cabeza;
            //si no esta vacia, verifica si el id es menor al id de la cabeza
        } else if (vehiculo.getAnio() > cabeza.getVehiculo().getAnio()) {
            //si es mayor, crea el nodo temporal y lo asigna a la izquierda
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
            //aux.setNext(cabeza.getNext());
            //aux.setAtras(cabeza);
           // cabeza.getAtras().setAtras(aux);
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
            aux.getNext().setAtras(temp);
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
            while (aux != null && aux.getVehiculo().getAnio()
                    < vehiculo.getAnio()) {
                aux = aux.getNext(); //Continuar con la busqueda
            }
            // Si el aux es diferente a nulo y se logran obtener los datos
            //siempre y cuando el ID exista se va a proceder a modificar el 
            //nombre
            if (aux != null && aux.getVehiculo().getAnio()
                    == vehiculo.getAnio()) {
                //Se obtienen los datos para cambiar el valor del nombre
                aux.getVehiculo().setEstado("Alquilado");
            }
        }
    }

    public void eliminar(String placa) { //definimos el metodo llamado elimina y 
        //ponemos como parametro el int id 
        //Lo que vamos a hacer es eliminar el id de una persona
        System.out.println(placa);
        if (cabeza != null) {//Si la lista no esta nula entonces empieza a buscar
            System.out.println(cabeza.getVehiculo().getPlaca());
            if (cabeza.getVehiculo().getPlaca().equals(placa)) {
                //buscamos el id utilizando un 
                //if statement y verificamos que la cabeza cumpla el parametro del id
                if(cabeza.getNext() == null){
                    cabeza = null;
                }else{
                cabeza = cabeza.getNext();
                }//sino cumple como parametro, 
                //seguimos buscando y definimos el siguiente nodo como cabeza
            } else {
                Nodo2 aux = cabeza; //se utiliza el modo auxiliar 
                //Mientras el nodo no este vacío 
                //de la lista sea menor que el buscado
                while (aux.getNext() != null
                        && !aux.getNext().getVehiculo().getPlaca().equals(placa)) {
                    aux = aux.getNext();
                    System.out.println("Entro al while");
                }
                //avanzo en la lista

                // si el que le sigue es mayor entonces para el ciclo 
                //y se ejecuta lo siguiente
                if (aux.getNext() != null
              && aux.getNext().getVehiculo().getPlaca().equals(placa)) {
                    //si el id es igual al del parametro...
                    if(aux.getNext().getNext() == null){
                        aux.setNext(null);
                        System.out.println("quitar el ultimo");
          
                    }else{
                        System.out.println("quitar el del medio");
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().getNext().setAtras(aux);
                    }
                    //y en este ultimo paso lo que hacemos es cambiar referencias
                }
            }
        }

    }
    
    public void mostrarVehiculos() {
        Nodo2 aux = cabeza;
        String output = "";
        // Recorre la lista hasta el ultimo nodo
        while (aux != null) {
            System.out.println(aux.getVehiculo().getPlaca());
            output += " Placa: " + aux.getVehiculo().getPlaca() + " | "
                    + " Marca: " + aux.getVehiculo().getMarca() + " | "
                    + " Modelo: " + aux.getVehiculo().getModelo() + " | "
                    + " Año: " + aux.getVehiculo().getAnio() + " | "
                    + " Color: " + aux.getVehiculo().getColor() + " | "
                    + " Cilindrada: " + aux.getVehiculo().getCilidrada()+" | "
                    + " Combustible: " + aux.getVehiculo().getCombustible()+" | "
                    + " Cant.Pasajeros: " + aux.getVehiculo().getPasajeros()+" | "
                    + " Precio: " + aux.getVehiculo().getPrecio() + " | "
                    + " Estado: " + aux.getVehiculo().getEstado()+ " | "+ "\n";
            aux = aux.getNext();
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
    public boolean existe(String placa) {
        boolean exist = false;
        //verificar si la lista esta vacia
        if (cabeza != null) {
            //sino, se crea el nodo temporal para recorrer la lista
            Nodo2 aux = cabeza;
            //ingresa a un ciclo mientras el nodo no este null y el
            //id del nodo sea menor que el parametro
            while (aux != null && !aux.getVehiculo().getPlaca().equals(placa) ) {
                aux = aux.getNext();
            }
            //almacenar true dentro de la variable si encontro el nodo
            exist = (aux != null && aux.getVehiculo().getPlaca().equals(placa));
    }
        return exist;
  }
    public String[] getArray() {
        return array;
}
    public void getAtributos(String placa){
        Nodo2 aux = cabeza;
        // Bandera para verificar si exist el elemento a search.
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (placa == aux.getVehiculo().getPlaca()) {
                // Cambia el value de la bandera.
                array[0] = aux.getVehiculo().getPlaca();
                array[1] = aux.getVehiculo().getColor();
                array[2] = aux.getVehiculo().getExtras();
                array[3] = aux.getVehiculo().getEstado();
                array[4] = aux.getVehiculo().getMarca();
                array[5] = aux.getVehiculo().getCombustible();
                array[6] = (String.valueOf(aux.getVehiculo().getPasajeros()));
                array[7] = (String.valueOf(aux.getVehiculo().getCilidrada()));
                array[8] = (String.valueOf(aux.getVehiculo().getPrecio()));
                array[9] = (String.valueOf(aux.getVehiculo().getAnio()));
                array[10] = (aux.getVehiculo().getModelo());
                                
                aux = null;
            } else {
                // Avanza al siguiente node.
                aux = aux.getNext();
            }
        }
}
}
    



