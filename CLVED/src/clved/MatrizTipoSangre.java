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
    int [][] matrizCompatibilidad = new int [8][8];
    
    
    
    
    
    public MatrizTipoSangre(){
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
               matrizTipoSangre [i][j] = "-";
           }
       }
             
       matrizCompatibilidad [0][0] = 1;
       matrizCompatibilidad [1][0] = 1;
       matrizCompatibilidad [2][0] = 1;
       matrizCompatibilidad [3][0] = 1;
       matrizCompatibilidad [4][0] = 1;
       matrizCompatibilidad [5][0] = 1;
       matrizCompatibilidad [6][0] = 1;
       matrizCompatibilidad [7][0] = 1;
       matrizCompatibilidad [1][1] = 1;
       matrizCompatibilidad [2][2] = 1;
       matrizCompatibilidad [3][3] = 1;
       matrizCompatibilidad [4][4] = 1;
       matrizCompatibilidad [5][5] = 1;
       matrizCompatibilidad [6][6] = 1;
       matrizCompatibilidad [7][7] = 1;
       matrizCompatibilidad [3][1] = 1;
       matrizCompatibilidad [5][1] = 1;
       matrizCompatibilidad [7][1] = 1;
       matrizCompatibilidad [3][2] = 1;
       matrizCompatibilidad [6][2] = 1;
       matrizCompatibilidad [7][2] = 1;
       matrizCompatibilidad [7][3] = 1;
       matrizCompatibilidad [5][4] = 1;
       matrizCompatibilidad [6][4] = 1;
       matrizCompatibilidad [7][4] = 1;
       matrizCompatibilidad [7][5] = 1;
       matrizCompatibilidad [7][6] = 1;
       
       
       
       

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
                        if(matrizCompatibilidad[i-1][j-1] == 1){
                            matrizTipoSangre[i][j] = "Si";
                            break;
                        }else{
                            matrizTipoSangre[i][j] = "No";
                            break;
                        }
                    }
                    j++;
                }
            } 
            i++;
        }
      
        
    }
    
    public String imprimiMatriz() {
        String salida = "";
        
        for (int i = 0; i < matrizTipoSangre.length; i++) {
            salida +="\t|";
            for (int j = 0; j < matrizTipoSangre[i].length; j++) {
                salida += matrizTipoSangre[i][j] ;
                if (j != matrizTipoSangre[i].length - 1) {
                    salida+="\t";
                }
            }
            salida+="|\n";
        }
        return salida;
    }

    
    
    public void imprimi() {
        System.out.println("\n");
        for(int k = 1; k <= matrizCompatibilidad.length; k++){
                System.out.print("\t"+k);
            }
        System.out.println("\n");
        for (int i = 0; i < matrizCompatibilidad.length; i++) {
            System.out.print(i+1+"\t|");
            for (int j = 0; j < matrizCompatibilidad[i].length; j++) {
                System.out.print(matrizCompatibilidad[i][j]);
                if (j != matrizCompatibilidad[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    
}