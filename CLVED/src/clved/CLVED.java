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
        
        /*Donador donador = new Donador("TImo","Camuendo" , 15 ," Bien varon ", "El quiereas bb ", "Soy sano ", "Papa");
        Donador donador1 = new Donador("T","Camuendo" , 15 ," Bien varon ", "El quiereas bb ", "Soy sano ", "Papa");
        Donador donador2 = new Donador("TIm","Camuendo" , 15 ," Bien varon ", "El quiereas bb ", "Soy sano ", "Papa");
        Lista lista = new Lista();
        
        lista.insertarNodo(donador);
        
        MatrizTipoSangre matriz = new MatrizTipoSangre();
        matriz.imprimirMatriz();
        
        ArbolCompatiblidad arbol = new ArbolCompatiblidad();
        arbol.insertar(1, donador);
        arbol.insertar(2, donador1);
        arbol.insertar(3, donador2);   
        System.out.println(arbol.recorrer(arbol.raiz));*/
        
        MatrizTipoSangre matriz = new MatrizTipoSangre();
        System.out.println(matriz.imprimirMatriz());
        System.out.println(matriz.calcularPorcentajeCompatibilidadSangre("A-", "A+"));
        System.out.println(matriz.imprimirMatrizPorcentajes());

    }
    
}
