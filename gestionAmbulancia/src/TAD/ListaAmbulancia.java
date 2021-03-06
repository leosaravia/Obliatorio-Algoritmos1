/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

import Dominio.Ambulancia;

/**
 *
 * @author Usuario
 */
public class ListaAmbulancia {

    NodoAmbulancia head;
    int size;//creo esta variable para controlar el tamaño de mi lista , cada vez que agrego un elemento aumento el tamaño

    public void setHead(NodoAmbulancia head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoAmbulancia getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    //al momento de crear la lista el head es null , ya que la Lista es null
    public ListaAmbulancia() {
        head = null;
        size = 0;
    }

    //Obtener elemento en la posicion que quieramos
    //TODO : pasar ambulancia en vez de index
    /* public Object Obtener(Ambulancia ambulancia)
    {
        int contador =0;
        NodoAmbulancia temporal = head;
        
        while(contador <= ambulancia)
        {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.ObtenerValor();
    }*/
    //Agrega un elemento al head(primero elemento de la lista)
    public void agregarInicio(Ambulancia ambulancia) {
        if (head == null) {
            head = new NodoAmbulancia(ambulancia);
        } else {
            //creamos un nodo temporal para almacenar el head y luego lo enlazamos con el nuevo nodo que pasaria a ser el head actual
            NodoAmbulancia temporal = head;
            NodoAmbulancia nuevo = new NodoAmbulancia(ambulancia);
            nuevo.enlazarSiguiente(temporal);
            head = nuevo;
        }
        size++;
    }

    //Elimina un elemento en un indice especificado
    public void eliminar(int indice) {

    }

    //Elimina el primer elemento de la Lista
    public void borrarInicio() {
        head = head.obtenerSiguiente();
        size--;

    }

    public boolean esVacia() {
        return head == null;
    }

    public void vaciar() {
        while (head != null) {
            borrarInicio();
        }
    }

    public void agregarFinal(Ambulancia ambulancia) {
        // Define un nuevo nodo.
        NodoAmbulancia nuevo = new NodoAmbulancia(ambulancia);
        // Agrega al valor al nodo.
        nuevo.ObtenerValor();
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            head = nuevo;
            // Caso contrario recorre la lista hasta llegar al ultimo nodo
            //y agrega el nuevo.
        } else {
            // Crea una copia de la lista.
            NodoAmbulancia aux = head;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.obtenerSiguiente() != null) {
                aux = aux.obtenerSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.enlazarSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        size++;
    }

    //PRE:Debe existir lista
    //POS: Elimina la lista
    public void eliminarLista() {
        // Elimina el valor y la referencia a los demas nodos.
        head = null;
        // Reinicia el contador de tamaño de la lista a 0.
        size = 0;
        System.out.println("Lista Ambulancia a sido destruida");
    }

    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoAmbulancia aux = head;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.ObtenerValor().mostrarAbmbulancia() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.obtenerSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }
    //busca ambulancia por iD y devuelve el objeto. 
    public Ambulancia getAmbulancia(String idAmb) {

        NodoAmbulancia aux = head;
        Ambulancia a = null;
        boolean flag = false;
        
        if (aux==null) {
            return a;
        }else{
        while (aux != null && !flag) {
            if (aux.valor.getIdAmbulancia().equals(idAmb)) {
                flag = true;
                a = aux.valor;
            } else {
                aux = aux.obtenerSiguiente();
            }
        }
        }
        return a;
    }
    
    //No si sirve... 
    public NodoAmbulancia siguienteNodo(ListaAmbulancia a){
       return a.head.obtenerSiguiente();
    }
    
}
