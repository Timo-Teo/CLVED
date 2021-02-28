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
public class MatrizTipoSangre {
    
    String [][] matrizTipoSangre = new String [9][9];
    private String tipoSangreReceptor;
    String tipoSangreDonador;
    
    public MatrizTipoSangre(String tipoSangre){
       matrizTipoSangre[0][0] = " X ";
       matrizTipoSangre[0][1] = "O-";
       matrizTipoSangre[1][0] = "O-";
       matrizTipoSangre[0][2] = "O+";
       matrizTipoSangre[2][0] = "O+";
       matrizTipoSangre[0][3] = "A-";
       matrizTipoSangre[3][0] = "A-";
       matrizTipoSangre[0][4] = "A+";
       matrizTipoSangre[4][0] = "A+";
       matrizTipoSangre[0][5] = "B-";
       matrizTipoSangre[5][0] = "B-";
       matrizTipoSangre[0][6] = "B+";
       matrizTipoSangre[6][0] = "B+";
       matrizTipoSangre[0][7] = "AB-";
       matrizTipoSangre[7][0] = "AB-";
       matrizTipoSangre[0][8] = "AB+";
       matrizTipoSangre[8][0] = "AB+";
       
       for(int i = 1; i< matrizTipoSangre.length; i++){
           for(int j = 1; j < matrizTipoSangre.length; j++){
               matrizTipoSangre [i][j] = "No";
           }
       }
       
       this.tipoSangreReceptor = tipoSangre;

    }

    public String getTipoSangreReceptor() {
        return tipoSangreReceptor;
    }

    public void setTipoSangreReceptor(String tipoSangreReceptor) {
        this.tipoSangreReceptor = tipoSangreReceptor;
    }

    
    public void insertar( String tipoSangreDonador){
        int i = 1;
        int j =1 ;
        while(i<9){
            if(tipoSangreReceptor.equals(matrizTipoSangre[i][0])){
                while(j<9){
                    if(tipoSangreDonador.equals(matrizTipoSangre[0][j])){
                        matrizTipoSangre[i][j] = "Si";
                        break;
                    }
                    j++;
                }
            } 
            i++;
        }
      
        
    }
    
    public void imprimiMatriz() {
        
        for (int i = 0; i < matrizTipoSangre.length; i++) {
            System.out.print("\t|");
            for (int j = 0; j < matrizTipoSangre[i].length; j++) {
                System.out.print(matrizTipoSangre[i][j]);
                if (j != matrizTipoSangre[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    
}