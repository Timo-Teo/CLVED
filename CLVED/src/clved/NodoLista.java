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
public class NodoLista {
    
    private Donador  INFO; // Guardamos donantes
    private NodoLista LIGA;
    
    public NodoLista(Donador miDonante, NodoLista liga){
        this.INFO = miDonante;
        this.LIGA = liga;
    }
    
    public NodoLista (Donador miDonante){
        this.INFO = miDonante;
        this.LIGA = null;
    }
    
    public NodoLista (){
       this.INFO = null;
       this.LIGA = null;
    }

    public Donador getINFO() {
        return INFO;
    }

    public void setINFO(Donador INFO) {
        this.INFO = INFO;
    }

    public NodoLista getLIGA() {
        return LIGA;
    }

    public void setLIGA(NodoLista LIGA) {
        this.LIGA = LIGA;
    }
    
    
    
}
