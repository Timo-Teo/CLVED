/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clved;

import javax.swing.JOptionPane;

/**
 *
 * @author Tim
 */
public class Lista {

    private NodoLista P;
    private NodoLista Q;
    private NodoLista T;

    public Lista() {
        super();
    }

    /*public void crearListaFinal(Donador miDonate){
        this.P = new NodoLista();
        this.P.setINFO(miDonate);
        this.P.setLIGA(null);
        NodoLista T;
        T = this.P;
        int opcion = JOptionPane.showConfirmDialog(null,"DEsea ingresar mas nodos?");
        while (opcion == JOptionPane.YES_OPTION){
            NodoLista Q = new NodoLista();
            Q.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del siguiente nodo"));
            Q.setLIGA(null);
            T.setLIGA(Q);
            T = Q;
            opcion = JOptionPane.showConfirmDialog(null,"DEsea ingresar mas nodos?");
            
        }
    }*/
    public void insertarNodo(Donador miDonate) {
        if (this.P == null) {
            this.P = new NodoLista();
            this.P.setINFO(miDonate);
            this.P.setLIGA(null);
        } else {
            //Si la lista esta llena
            NodoLista T = this.P;
            //Recorrer la lista hasta que llegue al final

            while (T.getLIGA() != null) {
                T = T.getLIGA();
            }
            //Insertar un nuevo nodo
            NodoLista Q = new NodoLista();
            Q.setINFO(miDonate);
            Q.setLIGA(null);
            T.setLIGA(Q);
        }
    }
    
    public String imprimirAristas(){
        
        String lista = "";
        // Crea una copia de la lista.
        NodoLista aux = P;
        // Recorre la lista hasta el final.
        while (aux != null) {
            // Imprime en pantalla el valor del nodo.
            lista += " " + aux.getINFO().toString() + "\n";
            // Avanza al siguiente nodo.
            aux = aux.getLIGA();
        }
        
        return lista;
    }

}
