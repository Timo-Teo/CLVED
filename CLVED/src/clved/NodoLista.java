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
    
    private Donante  INFO; // Guardamos donantes
    private NodoLista LIGA;
    
    public NodoLista(Donante miDonante, NodoLista liga){
        this.INFO = miDonante;
        this.LIGA = liga;
    }
    
    public NodoLista (Donante miDonante){
        this.INFO = miDonante;
        this.LIGA = null;
    }
    
    public NodoLista (){
       this.INFO = null;
       this.LIGA = null;
    }

    public Donante getINFO() {
        return INFO;
    }

    public void setINFO(Donante INFO) {
        this.INFO = INFO;
    }

    public NodoLista getLIGA() {
        return LIGA;
    }

    public void setLIGA(NodoLista LIGA) {
        this.LIGA = LIGA;
    }
    
    
    
}
