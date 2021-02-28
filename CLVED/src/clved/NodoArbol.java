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
    
    private NodoArbol izquierda;
    private NodoArbol derecha;
    private int porcentajeCompatibilidad;
    private int FE;
    
    public NodoArbol (int clave){
        this.derecha = null;
        this.izquierda = null;
        this.porcentajeCompatibilidad = clave;
        this.FE = 0;
    }
    
    public NodoArbol(NodoArbol ramaIzquierda, int clave, NodoArbol ramaDerecha){
        this.izquierda = ramaIzquierda;
        this.derecha = ramaDerecha;
        this.porcentajeCompatibilidad = clave;
        this.FE = 0;
    }
    
    public NodoArbol(){
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public int getInfo() {
        return porcentajeCompatibilidad;
    }

    public void setInfo(int info) {
        this.porcentajeCompatibilidad = info;
    }

    public int getFE() {
        return FE;
    }

    public void setFE(int FE) {
        this.FE = FE;
    }

}

