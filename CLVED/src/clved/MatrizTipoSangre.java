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
    int [][] matrizCompatibilidadPorcentajes = new int [8][8];
    
    
    
    
    
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
       
       //INICIALIZAR MATRIZ DE COMPATILIDAD
       matrizCompatibilidadPorcentajes [0][0] = 100;
       matrizCompatibilidadPorcentajes [1][0] = 100;
       matrizCompatibilidadPorcentajes [2][0] = 100;
       matrizCompatibilidadPorcentajes [3][0] = 100;
       matrizCompatibilidadPorcentajes [4][0] = 100;
       matrizCompatibilidadPorcentajes [5][0] = 100;
       matrizCompatibilidadPorcentajes [6][0] = 100;
       matrizCompatibilidadPorcentajes [7][0] = 100;
       matrizCompatibilidadPorcentajes [1][1] = 100;
       matrizCompatibilidadPorcentajes [2][2] = 100;
       matrizCompatibilidadPorcentajes [3][3] = 100;
       matrizCompatibilidadPorcentajes [4][4] = 100;
       matrizCompatibilidadPorcentajes [5][5] = 100;
       matrizCompatibilidadPorcentajes [6][6] = 100;
       matrizCompatibilidadPorcentajes [7][7] = 100;
       matrizCompatibilidadPorcentajes [3][1] = 100;
       matrizCompatibilidadPorcentajes [5][1] = 100;
       matrizCompatibilidadPorcentajes [7][1] = 100;
       matrizCompatibilidadPorcentajes [3][2] = 100;
       matrizCompatibilidadPorcentajes [6][2] = 100;
       matrizCompatibilidadPorcentajes [7][2] = 100;
       matrizCompatibilidadPorcentajes [7][3] = 100;
       matrizCompatibilidadPorcentajes [5][4] = 100;
       matrizCompatibilidadPorcentajes [6][4] = 100;
       matrizCompatibilidadPorcentajes [7][4] = 100;
       matrizCompatibilidadPorcentajes [7][5] = 100;
       matrizCompatibilidadPorcentajes [7][6] = 100;
       matrizCompatibilidadPorcentajes [0][1] = 50;
       matrizCompatibilidadPorcentajes [2][3] = 50;
       matrizCompatibilidadPorcentajes [2][6] = 50;
       matrizCompatibilidadPorcentajes [2][7] = 50;
       matrizCompatibilidadPorcentajes [3][6] = 50;
       matrizCompatibilidadPorcentajes [3][7] = 50;
       matrizCompatibilidadPorcentajes [4][5] = 50;
       matrizCompatibilidadPorcentajes [4][6] = 50;
       matrizCompatibilidadPorcentajes [4][7] = 50;
       matrizCompatibilidadPorcentajes [5][6] = 50;
       matrizCompatibilidadPorcentajes [5][7] = 50;
       matrizCompatibilidadPorcentajes [6][3] = 50;
       matrizCompatibilidadPorcentajes [6][5] = 50;
       matrizCompatibilidadPorcentajes [6][7] = 50;
 
    }

    public String getTipoSangreReceptor() {
        return tipoSangreReceptor;
    }

    public void setTipoSangreReceptor(String tipoSangreReceptor) {
        this.tipoSangreReceptor = tipoSangreReceptor;
    }

    
    public void insertar( String tipoSangreDonador){
        int i = 1;
        int j = 1 ;
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
    
    public String imprimirMatriz() {
        String salida = "";
        
        for (int i = 0; i < matrizTipoSangre.length; i++) {
            salida +=" |";
            for (int j = 0; j < matrizTipoSangre[i].length; j++) {
                salida += matrizTipoSangre[i][j] ;
                if (j != matrizTipoSangre[i].length - 1) {
                    salida+="\t";
                }
            }
            salida+="  |\n";
        }
        return salida;
    }
    
    public int calcularPorcentajeCompatibilidadSangre( String tipoSangreReceptor, String tipoSangreDonador){
        int i = 1;
        int j = 1 ;
        while(i<9){
            if(tipoSangreReceptor.equals(matrizTipoSangre[i][0])){
                while(j<9){
                    if(tipoSangreDonador.equals(matrizTipoSangre[0][j])){
                        System.out.println(i);
                        System.out.println(j);
                        return matrizCompatibilidadPorcentajes [i -1] [j -1];
                    }
                    j++;
                }
            } 
            i++;
        }
       return 0; 
    }

    
    public String imprimirMatrizPorcentajes() {
        String salida = "";
        
        for (int i = 0; i < matrizCompatibilidadPorcentajes.length; i++) {
            salida +=" |";
            for (int j = 0; j < matrizCompatibilidadPorcentajes[i].length; j++) {
                salida += matrizCompatibilidadPorcentajes[i][j] ;
                if (j != matrizCompatibilidadPorcentajes[i].length - 1) {
                    salida+="\t";
                }
            }
            salida+="  |\n";
        }
        return salida;
    }
    
}