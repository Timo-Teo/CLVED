/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clved;

/**
 *
 * @author Tim
 */
public class ArbolCompatiblidad {

    NodoArbol raiz;
    String salida="";
    public ArbolCompatiblidad() {
        raiz = null;
    }

    //CREAMOS UN METODO PARA INSERTAR FRUTAS EN EL ARBOL
    public void insertar(int i, Donador donante) {
        salida = "";
        NodoArbol n = new NodoArbol(i);
        n.contenido = donante.getNombreDonante();

        //SI LA RAIZ ES NULA SIGNIFICA QUE NO HA EMPEZADO A CRECER EL ARBOL
        if (raiz == null) {
            raiz = n;
        } else {
            // DE LO CONTRARIO CREAMO UN NO AUXILIAR ARA BUSCAR EN DONDE COLOCARLO, SI A LA DER O IZQ
            NodoArbol aux = raiz;
            //MIENTRAS EL AUXILIAR NO SEA NULO HAGAMOS QUE EL PADRE DEL NODO SEA EL AUXILIAR,
            //ASI VAMOS SUBIENDO EN EL ARBOL
            while (aux != null) {

                n.padre = aux;
                //VALIDAMOS, SI EL INDICE ES MAYOR ENTONCES VA A LA DERECHA
                if (n.llave >= aux.llave) {
                    aux = aux.derecha;
                } else {
                    //SI NO VA A LA IZQUIERDA
                    aux = aux.izquierda;
                }
            }
            //si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            //dentro del arbol
            if (n.llave < n.padre.llave) {
                n.padre.izquierda = n;
            } else {
                n.padre.derecha = n;
            }
        }
    }

    //CREAREMOS UN METODO PRA RECORRER inorder LA RAMA IZQUIERDA Y LUEGO LA DERECHA PARA
    //PARA ORDENAR LOS INDICES DE CADA NODO
    public String recorrer(NodoArbol n) {
        
        if (n != null) {
            recorrer(n.izquierda);
            salida += "COMPATIBILIDAD: " + n.llave +" %"+ " NOMBRE: " + n.contenido+"\n";
            recorrer(n.derecha);
        }
        
        return salida;
    }
    
    
    
}
