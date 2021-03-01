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
public class NodoArbol {

    public NodoArbol padre;
    public NodoArbol derecha;
    public NodoArbol izquierda;
    public int llave;
    public Object contenido;

    //CREAMOS UN CONSTRUCTOR QUE RECIBA UN INDICE PERO NO LOS DEMAS ATRIBUTOS
    public NodoArbol(int indice) {
        llave = indice;
        derecha = null;
        izquierda = null;
        padre = null;
        contenido = null;
    }

}
