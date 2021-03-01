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
public class CLVED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test
        
        Donante donador = new Donante("TImo","Camuendo" , 15 ," Bien varon ", "El quiereas bb ", "Soy sano ", "Papa");
        Donante donador1 = new Donante("T","Camuendo" , 15 ," Bien varon ", "El quiereas bb ", "Soy sano ", "Papa");
        Donante donador2 = new Donante("TIm","Camuendo" , 15 ," Bien varon ", "El quiereas bb ", "Soy sano ", "Papa");
        Lista lista = new Lista();
        
        lista.insertarNodo(donador);
        
        MatrizTipoSangre matriz = new MatrizTipoSangre();
        matriz.imprimi();
        
        ArbolCompatiblidad arbol = new ArbolCompatiblidad();
        arbol.insertar(1, donador);
        arbol.insertar(2, donador1);
        arbol.insertar(3, donador2);   
        System.out.println(arbol.recorrer(arbol.raiz));

    }
    
}
