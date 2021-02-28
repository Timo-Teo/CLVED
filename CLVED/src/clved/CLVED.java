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
        
        Lista lista = new Lista();
        
        lista.insertarNodo(donador);
                

    }
    
}
