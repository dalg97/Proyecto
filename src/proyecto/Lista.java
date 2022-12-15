
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 * @author danny
 */
public class Lista {
    //Atributos de la lista
    private Nodo2 cabeza;
    private String array [] = new String [11];
    
    //Metodo para insertar vehiculos
    public void insertar(Vehiculo vehiculo) {
        if (cabeza == null) {
            //si la lista esta vacia, se inserta como la cabeza
            cabeza = new Nodo2(vehiculo);
            //si no esta vacia, verifica si el anio es mas reciente
        } else if (vehiculo.getAnio() > cabeza.getVehiculo().getAnio()) {
            //si es reciente, crea el nodo temporal y lo asigna a la izquierda
            //de la cabeza
            Nodo2 aux = new Nodo2(vehiculo);
            aux.setNext(cabeza);
            cabeza.setAtras(aux);
            //cabeza toma el valor del nodo temporal
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            //Si el siguiente es null, se pone al lado derecho
            Nodo2 aux = new Nodo2(vehiculo);
            cabeza.setNext(aux);
            aux.setAtras(cabeza);
        } else {
            //si no cumple con las anteriores, se crea el nodo temporal con 
            //el valor de la cabeza e ingresa al ciclo para recorrer la lista
            Nodo2 aux = cabeza;
            //Ingresa a un while para recorrer la lista y verificar si el anio 
            //es mas reciente para colocarlo a la derecha
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
    //metodo modificar vehiculo
    public void modificar(Vehiculo vehiculo) {
        //Buscar el vehiculo y ver si este existe
        if (cabeza != null) {
            //buscar si no esta vacia
            Nodo2 aux = cabeza; //utilizo aux como un buscador            
            while (aux != null && aux.getVehiculo().getAnio()
                    < vehiculo.getAnio()) {
                aux = aux.getNext(); //Continuar con la busqueda
            }           
            if (aux != null && aux.getVehiculo().getAnio()
                    == vehiculo.getAnio()) {
                //Se obtienen los datos para cambiar el valor del estado
                aux.getVehiculo().setEstado("Alquilado");
            }
        }
    }
    //metodo eliminar vehiculo
    public void eliminar(String placa) { 
        //ponemos como parametro la placa 
        if (cabeza != null) {//Si la lista no esta nula entonces empieza a buscar
            if (cabeza.getVehiculo().getPlaca().equals(placa)) {
                //si es la placa hace match con la cabeza                  
                if(cabeza.getNext() == null){
                    cabeza = null;
                }else{
                cabeza = cabeza.getNext();
                }
            } else {
                //Si no es la cabeza, recorre el la lista para encontrarlo
                Nodo2 aux = cabeza; //se utiliza el modo auxiliar 
                while (aux.getNext() != null
                        && !aux.getNext().getVehiculo().getPlaca().equals(placa)) {
                    aux = aux.getNext();//avanzo en la lista
                }

                if (aux.getNext() != null
              && aux.getNext().getVehiculo().getPlaca().equals(placa)) {
                    //si la placa es igual al del parametro...
                    if(aux.getNext().getNext() == null){
                        aux.setNext(null);         
                    }else{
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().getNext().setAtras(aux);
                    }
                    //y en este ultimo paso lo que hacemos es cambiar referencias
                }
            }
        }
    }
    //Metodo mostrar la lista
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
                   + " Estado: " + aux.getVehiculo().getEstado()+ " | "+ "\n"
                    +" Extras :" + aux.getVehiculo().getExtras();
            aux = aux.getNext();
        }
        JOptionPane.showMessageDialog(null, output);
    }
    //metodo para verificar si existe el vehiculo
    public boolean existe(String placa) {
        boolean exist = false;
        //verificar si la lista esta vacia
        if (cabeza != null) {
            //sino, se crea el nodo temporal para recorrer la lista
            Nodo2 aux = cabeza;
            //ingresa a un ciclo mientras el nodo no este null
            while (aux != null && !aux.getVehiculo().getPlaca().equals
                (placa) ) {
                aux = aux.getNext();
            }
            //almacenar true dentro de la variable si encontro el nodo
            exist = (aux != null && aux.getVehiculo().getPlaca().equals
        (   placa));
    }
        return exist;
  }
    //metodo para devolver el array con los attributos
    public String[] getArray() {
        return array;
}
    //MEtodo modificar vehiculo
    public void modificarV(String Placa, String marca, String modelo, int anio,
            String color, int cilindrada, String combustible, int pasajeros,
            int precio, String Estado, String Extras){
        Nodo2 aux=cabeza;
        while (aux != null) {
            //Si la encuentra la placa, cambia valores
            if(Placa.equals(aux.getVehiculo().getPlaca())){
                aux.getVehiculo().setPlaca(Placa);
                aux.getVehiculo().setColor(color);
                aux.getVehiculo().setExtras(Extras);
                aux.getVehiculo().setEstado(Estado);
                aux.getVehiculo().setMarca(marca);
                aux.getVehiculo().setCombustible(combustible);
                aux.getVehiculo().setPasajeros(pasajeros);
                aux.getVehiculo().setCilidrada(cilindrada);
                aux.getVehiculo().setPrecio(precio);
                aux.getVehiculo().setAnio(anio);
                aux.getVehiculo().setModelo(modelo);
                aux = null;
            }else{
                aux.getNext();
            }
        }  
    }
    //Metodo para obtener los atributos ya seteados
    public void getAtributos(String placa){
        Nodo2 aux = cabeza;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la lista
        while (aux != null) {
            // Compara si el placa es igual al de reference.
            if (placa.equals(aux.getVehiculo().getPlaca())) {
                //Almacenar los atributos en el array
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
    
        


    



